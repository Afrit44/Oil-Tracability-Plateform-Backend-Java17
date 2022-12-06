package com.Oil4Med.Oil4Med.Service.Impl;

import com.Oil4Med.Oil4Med.Model.OliveHarvest;
import com.Oil4Med.Oil4Med.Repository.OliveHarvestRepository;
import com.Oil4Med.Oil4Med.Repository.OliveSupplyForExtractionRepository;
import com.Oil4Med.Oil4Med.Service.OliveSupplyForExtractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OliveSupplyForExtractionServiceImpl implements OliveSupplyForExtractionService {
    @Autowired
    OliveHarvestRepository oliveHarvestRepository;
    @Autowired
    OliveSupplyForExtractionRepository oliveSupplyForExtractionRepository;
    public OliveSupplyForExtractionServiceImpl(OliveHarvestRepository oliveHarvestRepository, OliveSupplyForExtractionRepository oliveSupplyForExtractionRepository)
    {
        this.oliveSupplyForExtractionRepository =oliveSupplyForExtractionRepository;
        this.oliveHarvestRepository=oliveHarvestRepository;

    }
    @Override
    public com.Oil4Med.Oil4Med.Model.OliveSupplyForExtraction createOSupplyForExtraction(Long harvestId, com.Oil4Med.Oil4Med.Model.OliveSupplyForExtraction oSupplyForExtraction) {
        OliveHarvest oliveHarvest = oliveHarvestRepository.findById(harvestId).get();
        oSupplyForExtraction.setOliveHarvest(oliveHarvest);
        return (oliveSupplyForExtractionRepository.save(oSupplyForExtraction));
    }

    @Override
    public com.Oil4Med.Oil4Med.Model.OliveSupplyForExtraction updateOSupplyForExtraction(Long oSupplyForExtractId, Long harvestId, com.Oil4Med.Oil4Med.Model.OliveSupplyForExtraction oSupplyForExtraction) {
        com.Oil4Med.Oil4Med.Model.OliveSupplyForExtraction oldSupplyExtraction = oliveSupplyForExtractionRepository.findById(oSupplyForExtractId).get();
        OliveHarvest oldHarvest = oliveHarvestRepository.findById(harvestId).get();
        oldSupplyExtraction.setOliveHarvest(oldHarvest);
        oldSupplyExtraction.setSupplyId(oSupplyForExtraction.getSupplyId());
        oldSupplyExtraction.setExtractionType(oldSupplyExtraction.getExtractionType());
        oldSupplyExtraction.setWeight(oldSupplyExtraction.getWeight());

        return oliveSupplyForExtractionRepository.save(oldSupplyExtraction);
    }

    @Override
    public void deleteOSupplyForExtraction(Long oSupplyForExtractId) {
        oliveSupplyForExtractionRepository.deleteById(oSupplyForExtractId);

    }

    @Override
    public List<com.Oil4Med.Oil4Med.Model.OliveSupplyForExtraction> getoSupplyForExtracts() {
        return oliveSupplyForExtractionRepository.findAll();
    }

    @Override
    public com.Oil4Med.Oil4Med.Model.OliveSupplyForExtraction getOSupplyForExtractById(Long oSupplyForExtractId) {
        return oliveSupplyForExtractionRepository.findById(oSupplyForExtractId).orElse(null);
    }
}
