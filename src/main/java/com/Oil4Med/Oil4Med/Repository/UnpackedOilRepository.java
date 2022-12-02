package com.Oil4Med.Oil4Med.Repository;

import com.Oil4Med.Oil4Med.Model.Tank;
import com.Oil4Med.Oil4Med.Model.UnpackedOil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnpackedOilRepository extends JpaRepository<UnpackedOil, Long> {
}
