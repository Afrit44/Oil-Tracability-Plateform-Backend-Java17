package com.Oil4Med.Oil4Med.Service;

import com.Oil4Med.Oil4Med.Model.OliveGrove;
import com.Oil4Med.Oil4Med.Model.ProductionBatch;

import java.util.List;

public interface ProductionBatchService {
    public abstract ProductionBatch createProductionBatch(ProductionBatch productionBatch);
    public abstract ProductionBatch updateProductionBatch(ProductionBatch productionBatch);
    public abstract void deleteProductionBatch(Long productionBatchId);
    public abstract List<ProductionBatch> getProductionBatches();
    public abstract ProductionBatch getProductionBatchById(Long productionBatchId);
}
