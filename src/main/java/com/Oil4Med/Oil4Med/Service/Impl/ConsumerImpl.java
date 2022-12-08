package com.Oil4Med.Oil4Med.Service.Impl;

import com.Oil4Med.Oil4Med.Model.*;
import com.Oil4Med.Oil4Med.Model.Enum.Buyer;
import com.Oil4Med.Oil4Med.Model.Enum.Seller;
import com.Oil4Med.Oil4Med.Repository.ConsumerRepository;
import com.Oil4Med.Oil4Med.Service.ConsumerService;
import com.Oil4Med.Oil4Med.Service.OilProductService;
import com.Oil4Med.Oil4Med.Service.PurchaseOilService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ConsumerImpl implements ConsumerService {

    @Autowired
    ConsumerRepository consumerRepository;
    @Autowired
    PurchaseOilService purchaseOilService;
    @Autowired
    OilProductService oilProductService;
    @Override
    public List<Consumer> getConsumers() {
        List<Consumer> consumers = new ArrayList<>();
        consumerRepository.findAll().forEach(consumers::add);
        return consumers;
    }

    @Override
    public Consumer getConsumersById(Long id) {
        return consumerRepository.findById(id).get();
    }

    @Override
    public Consumer addConsumer(Consumer consumer) {
        return consumerRepository.save(consumer);
    }

    @Override
    public void deleteConsumer(Consumer consumer) {
        consumerRepository.delete(consumer);
    }

    @Override
    public void updateConsumer(Long consumerId, Consumer newConsumer) {
        Consumer consumer = consumerRepository.findById(consumerId).get();
        consumer.setEmail(newConsumer.getEmail());
        consumer.setLastName(newConsumer.getLastName());
        consumer.setFirstName(newConsumer.getFirstName());
        consumer.setPassword(newConsumer.getPassword());
        consumerRepository.save(consumer);
    }

    @Override
    public PurchaseOil purchaseOilFromFarmer(Consumer consumer, Farmer farmer, OilProduct oilProduct, double quantity, double price) {
        //Subtract the quantity bought by the consumer from the farmer and update it in database
        oilProduct.setOilQuantity(oilProduct.getOilQuantity()-quantity);
        oilProductService.updateOilProduct(oilProduct.getOilProductId(),oilProduct);
        //Add a new Purchase Oil
        PurchaseOil purchaseOil = new PurchaseOil();
        purchaseOil.setBuyerId(consumer.getConsumerId());
        purchaseOil.setBuyerType(Buyer.CONSUMER);
        purchaseOil.setSellerId(farmer.getFarmerId());
        purchaseOil.setSellerType(Seller.FARMER);
        purchaseOil.setPrice(price);
        purchaseOil.setQuantity(quantity);
        purchaseOil.setConsumer(consumer);
        purchaseOil.setOilProduct(oilProduct);
        return purchaseOilService.addPurchaseOil(purchaseOil);
    }

    @Override
    public PurchaseOil purchaseOilFromMill(MillFactory millFactory, OilProduct oilProduct, double quantity, double price, Consumer consumer) {
        //Subtract the quantity bought by the consumer from the farmer and update it in database
        if (oilProduct.getOilQuantity()-quantity<0){
            //Quantity subtracted is more than the one already in hand.
            throw new RuntimeException();
        }
        oilProduct.setOilQuantity(oilProduct.getOilQuantity()-quantity);
        oilProductService.updateOilProduct(oilProduct.getOilProductId(),oilProduct);
        //Add a new Purchase Oil
        PurchaseOil purchaseOil = new PurchaseOil();
        purchaseOil.setBuyerId(consumer.getConsumerId());
        purchaseOil.setBuyerType(Buyer.CONSUMER);
        purchaseOil.setSellerId(millFactory.getMillId());
        purchaseOil.setSellerType(Seller.MILL);
        purchaseOil.setPrice(price);
        purchaseOil.setQuantity(quantity);
        purchaseOil.setConsumer(consumer);
        purchaseOil.setOilProduct(oilProduct);
        return purchaseOilService.addPurchaseOil(purchaseOil);
    }

    @Override
    public void checkTraceability() {
        //This one need a very GOOD discussion.
    }
}
