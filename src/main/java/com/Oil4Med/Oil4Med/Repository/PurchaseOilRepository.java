package com.Oil4Med.Oil4Med.Repository;

import com.Oil4Med.Oil4Med.Model.PurchaseHarvest;
import com.Oil4Med.Oil4Med.Model.PurchaseOil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOilRepository extends JpaRepository<PurchaseOil, Long> {
}