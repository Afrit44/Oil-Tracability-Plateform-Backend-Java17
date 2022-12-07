package com.Oil4Med.Oil4Med.Service.Impl;

import com.Oil4Med.Oil4Med.Model.Machine;
import com.Oil4Med.Oil4Med.Model.MillFactory;
import com.Oil4Med.Oil4Med.Repository.MillFactoryRepository;
import com.Oil4Med.Oil4Med.Service.MillFactoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class MillFactoryImpl implements MillFactoryService {
    @Autowired
    MillFactoryRepository millFactoryRepository;

    public MillFactoryImpl(MillFactoryRepository millFactoryRepository){
        this.millFactoryRepository=millFactoryRepository;
    }
    @Override
    public List<MillFactory> getMillFactories() {
        List<MillFactory> millFactories  = new ArrayList<>();
        millFactoryRepository.findAll().forEach(millFactories::add);
        return millFactories;
    }

    @Override
    public MillFactory getMillFactoryById(Long id) {
        return millFactoryRepository.findById(id).get();
    }

    @Override
    public MillFactory addMillFactory(MillFactory millFactory) {
        return millFactoryRepository.save(millFactory);
    }

    @Override
    public void deleteMillFactory(MillFactory millFactory) {
        millFactoryRepository.delete(millFactory);
    }

    @Override
    public void updateMillFactory(Long id, MillFactory millFactory) {
        MillFactory millFactoryFromDb = millFactoryRepository.findById(id).get();
        millFactoryFromDb.setMillId(millFactory.getMillId());
        millFactoryFromDb.setMillName(millFactory.getMillName());
        millFactoryFromDb.setPassword(millFactory.getPassword());
        millFactoryFromDb.setMillingCapacity(millFactory.getMillingCapacity());
        millFactoryFromDb.setAddress(millFactory.getAddress());
        millFactoryFromDb.setEmail(millFactory.getEmail());
        millFactoryFromDb.setFax(millFactory.getFax());
        millFactoryFromDb.setNumberOfMachines(millFactory.getNumberOfMachines());
        millFactoryFromDb.setManagerName(millFactory.getManagerName());
        millFactoryFromDb.setStoringMean(millFactory.getStoringMean());
        millFactoryFromDb.setYearOfCreation(millFactory.getYearOfCreation());
        millFactoryFromDb.setPhoneNumber(millFactory.getPhoneNumber());
        millFactoryFromDb.setWebsite(millFactory.getWebsite());
        millFactoryRepository.save(millFactoryFromDb);
    }
}
