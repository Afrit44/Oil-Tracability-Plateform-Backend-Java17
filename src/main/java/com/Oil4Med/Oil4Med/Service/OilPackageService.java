package com.Oil4Med.Oil4Med.Service;


import com.Oil4Med.Oil4Med.Model.OilPackage;

import java.util.List;

public interface OilPackageService {

    List<OilPackage> getOilPackage();
    OilPackage getOilPackageById(Long id);
    void addOilPackage(OilPackage oilPackage);
    void deleteOilPackage(OilPackage oilPackage);
    void updateOilPackage(Long id, OilPackage oilPackage);
}
