package com.Oil4Med.Oil4Med.Service.Impl;

import com.Oil4Med.Oil4Med.Model.StorageArea;
import com.Oil4Med.Oil4Med.Repository.StorageAreaRepository;
import com.Oil4Med.Oil4Med.Service.StorageAreaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class StorageAreaImpl implements StorageAreaService {

    @Autowired
    StorageAreaRepository storageAreaRepository;
    @Override
    public List<StorageArea> getStorageArea() {
        List<StorageArea> storageAreas = new ArrayList<>();
        storageAreaRepository.findAll().forEach(storageAreas::add);
        return storageAreas;
    }

    @Override
    public StorageArea getStorageAreaById(Long id) {
        return storageAreaRepository.findById(id).get();
    }

    @Override
    public StorageArea addStorageArea(StorageArea storageArea) {
        return storageAreaRepository.save(storageArea);
    }

    @Override
    public void deleteStorageArea(StorageArea storageArea) {
        storageAreaRepository.delete(storageArea);
    }

    @Override
    public void updateStorageArea(Long id, StorageArea storageArea) {
        StorageArea storageAreaFromDB = storageAreaRepository.findById(id).get();

        storageAreaRepository.save(storageArea);
    }
}
