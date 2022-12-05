package com.Oil4Med.Oil4Med.Service;

import com.Oil4Med.Oil4Med.Model.MillAgreement;
import com.Oil4Med.Oil4Med.Model.MillFactory;

import java.util.List;

public interface MillFactoryService {

    List<MillFactory> getMillFactories();
    MillFactory getMillFactoryById(Long id);
    void addMillFactory(MillFactory millFactory);
    void deleteMillFactory(MillFactory millFactory);
    void updateMillFactory(Long id, MillFactory millFactory);
}

