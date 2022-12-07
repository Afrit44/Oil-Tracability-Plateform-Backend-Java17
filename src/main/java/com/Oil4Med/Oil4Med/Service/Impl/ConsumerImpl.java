package com.Oil4Med.Oil4Med.Service.Impl;

import com.Oil4Med.Oil4Med.Model.Admin;
import com.Oil4Med.Oil4Med.Model.Consumer;
import com.Oil4Med.Oil4Med.Repository.ConsumerRepository;
import com.Oil4Med.Oil4Med.Service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ConsumerImpl implements ConsumerService {

    @Autowired
    ConsumerRepository consumerRepository;
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
    public void updateConsumer(Consumer consumer, Consumer newConsumer) {
        consumer.setEmail(newConsumer.getEmail());
        consumer.setLastName(newConsumer.getLastName());
        consumer.setFirstName(newConsumer.getFirstName());
        consumer.setPassword(newConsumer.getPassword());
        consumerRepository.save(consumer);
    }
}
