package com.Oil4Med.Oil4Med.Service;

import com.Oil4Med.Oil4Med.Model.Admin;
import com.Oil4Med.Oil4Med.Model.Farmer;

import java.util.List;

public interface FarmerService {

    List<Farmer> getFarmers();

    Farmer getFarmerById(Long id);

    Farmer addFarmer(Farmer farmer);

    void deleteFarmer(Farmer farmer);

    void updateFarmer(Farmer farmer, Farmer newFarmer);

}
