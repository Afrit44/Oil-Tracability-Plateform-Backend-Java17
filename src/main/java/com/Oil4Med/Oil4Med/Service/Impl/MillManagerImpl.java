package com.Oil4Med.Oil4Med.Service.Impl;

import com.Oil4Med.Oil4Med.Model.MillManager;
import com.Oil4Med.Oil4Med.Model.PurchaseHarvest;
import com.Oil4Med.Oil4Med.Repository.MillManagerRepository;
import com.Oil4Med.Oil4Med.Repository.PurchaseHarvestRepository;
import com.Oil4Med.Oil4Med.Service.MillManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MillManagerImpl implements MillManagerService {

    @Autowired
    MillManagerRepository millManagerRepository;

    @Override
    public List<MillManager> getMillManagers() {
        List<MillManager> millManagerList = new ArrayList<>();
        millManagerRepository.findAll().forEach(millManagerList::add);
        return millManagerList;
    }

    @Override
    public MillManager getMillManagerById(Long id) {
        return millManagerRepository.findById(id).get();
    }

    @Override
    public MillManager addMillManager(MillManager millManager) {
        return millManagerRepository.save(millManager);
    }

    @Override
    public void deleteMillManager(MillManager millManager) {
        millManagerRepository.delete(millManager);
    }

    @Override
    public void updateMillManager(Long id, MillManager millManager) {
        MillManager millManagerFromDB = millManagerRepository.findById(id).get();
        millManagerFromDB.setFirstName(millManager.getFirstName());
        millManagerFromDB.setLastName(millManager.getLastName());
        millManagerFromDB.setEmail(millManager.getEmail());
        millManagerFromDB.setPassword(millManagerFromDB.getPassword());
        millManagerRepository.save(millManagerFromDB);
    }
}
