package com.Oil4Med.Oil4Med.Repository;

import com.Oil4Med.Oil4Med.Model.Extraction;
import com.Oil4Med.Oil4Med.Model.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmerRepository extends JpaRepository<Farmer, Long> {
}
