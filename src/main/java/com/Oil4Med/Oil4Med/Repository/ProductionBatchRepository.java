package com.Oil4Med.Oil4Med.Repository;

import com.Oil4Med.Oil4Med.Model.OliveSupplyForExtraction;
import com.Oil4Med.Oil4Med.Model.ProductionBatch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductionBatchRepository extends JpaRepository<ProductionBatch, Long> {
}
