package com.Oil4Med.Oil4Med.Service.Impl;

import com.Oil4Med.Oil4Med.Model.ProductionBatch;
import com.Oil4Med.Oil4Med.Repository.ProductionBatchRepository;
import com.Oil4Med.Oil4Med.Service.ProductionBatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductionBatchServiceImpl implements ProductionBatchService {

    @Autowired
    ProductionBatchRepository productionBatchRepository;
    public ProductionBatchServiceImpl (ProductionBatchRepository productionBatchRepository)
    {
        this.productionBatchRepository = productionBatchRepository;
    }
    @Override
    public ProductionBatch createProductionBatch(ProductionBatch productionBatch) {
        return productionBatchRepository.save(productionBatch);
    }

    @Override
    public ProductionBatch updateProductionBatch(ProductionBatch productionBatch) {
        return productionBatchRepository.save(productionBatch);
    }

    @Override
    public void deleteProductionBatch(Long productionBatchId) {
        productionBatchRepository.deleteById(productionBatchId);

    }

    @Override
    public List<ProductionBatch> getProductionBatches() {
        return productionBatchRepository.findAll();
    }

    @Override
    public ProductionBatch getProductionBatchById(Long productionBatchId) {
        return productionBatchRepository.findById(productionBatchId).orElse(null);
    }
}
