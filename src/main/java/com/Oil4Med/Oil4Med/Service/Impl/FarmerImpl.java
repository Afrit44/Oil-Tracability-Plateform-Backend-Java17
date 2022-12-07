package com.Oil4Med.Oil4Med.Service.Impl;

import com.Oil4Med.Oil4Med.Model.Farmer;
import com.Oil4Med.Oil4Med.Repository.FarmerRepository;
import com.Oil4Med.Oil4Med.Service.FarmerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class FarmerImpl implements FarmerService {

    @Autowired
    FarmerRepository farmerRepository;

    @Override
    public List<Farmer> getFarmers() {
        List<Farmer> farmers = new ArrayList<>();
        farmerRepository.findAll().forEach(farmers::add);
        return farmers;
    }
    @Override
    public Farmer getFarmerById(Long id) {
        return farmerRepository.findById(id).get();
    }

    @Override
    public Farmer addFarmer(Farmer farmer) {
        return farmerRepository.save(farmer);
    }

    @Override
    public void deleteFarmer(Farmer farmer) {
        farmerRepository.delete(farmer);
    }

    @Override
    public void updateFarmer(Farmer farmer, Farmer newFarmer) {
        farmer.setEmail(newFarmer.getEmail());
        farmer.setLastName(newFarmer.getLastName());
        farmer.setFirstName(newFarmer.getFirstName());
        farmer.setPassword(newFarmer.getPassword());
        farmer.setPhoneNumber(newFarmer.getPhoneNumber());
        farmerRepository.save(farmer);
    }
}
