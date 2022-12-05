package com.Oil4Med.Oil4Med.Service;


import com.Oil4Med.Oil4Med.Model.PackagingOperation;

import java.util.List;

public interface OilPackageService {

    List<PackagingOperation> getOilPackage();
    PackagingOperation getOilPackageById(Long id);
    void addOilPackage(PackagingOperation packagingOperation);
    void deleteOilPackage(PackagingOperation packagingOperation);
    void updateOilPackage(Long id, PackagingOperation packagingOperation);
}
