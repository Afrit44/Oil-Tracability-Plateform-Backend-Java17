package com.Oil4Med.Oil4Med.Repository;

import com.Oil4Med.Oil4Med.Model.OilProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface OilProductRepository extends JpaRepository<OilProduct, Long> {
}
