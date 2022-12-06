package com.Oil4Med.Oil4Med.Service;

import java.util.List;

public interface OliveSupplyForExtractionService {
    public abstract com.Oil4Med.Oil4Med.Model.OliveSupplyForExtraction createOSupplyForExtraction(Long harvestId, com.Oil4Med.Oil4Med.Model.OliveSupplyForExtraction oSupplyForExtraction);
    public abstract com.Oil4Med.Oil4Med.Model.OliveSupplyForExtraction updateOSupplyForExtraction(Long oSupplyForExtractId, Long harvestId, com.Oil4Med.Oil4Med.Model.OliveSupplyForExtraction oSupplyForExtraction);
    public abstract void deleteOSupplyForExtraction(Long oSupplyForExtractId);
    public abstract List<com.Oil4Med.Oil4Med.Model.OliveSupplyForExtraction> getoSupplyForExtracts();
    public abstract com.Oil4Med.Oil4Med.Model.OliveSupplyForExtraction getOSupplyForExtractById(Long oSupplyForExtractId);
}
