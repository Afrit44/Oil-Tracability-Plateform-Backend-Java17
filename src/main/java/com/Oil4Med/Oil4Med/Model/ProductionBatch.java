package com.Oil4Med.Oil4Med.Model;

import com.Oil4Med.Oil4Med.Model.Enum.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="ProductionBatch")
public class ProductionBatch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "production_batch_id", nullable = false)
    private Long productionBatchId;

//    @Column(name = "extraction_id", nullable = false)
//    private Long extractionId;

    @Column(name = "analysis_quality_1")
    private AnalysisQuality1 analysisQuality1;

    @Column(name = "analysis_quality_2")
    private AnalysisQuality2 analysisQuality2;

    @Column(name = "analysis_quality_3")
    private AnalysisQuality3 analysisQuality3;

    @Column(name = "analysis_quality_4")
    private AnalysisQuality4 analysisQuality4;

    @Column(name = "analysis_quality_5")
    private AnalysisQuality5 analysisQuality5;

    @Column(name = "analysis_quality_6")
    private AnalysisQuality6 analysisQuality6;

    @Column(name = "production_for_sale")
    private boolean productionForSale;

    @Column(name = "oil_quantity")
    private double oilQuantity;

    @Column(name = "purchase_date")
    private Date purchaseDate;

    @Column(name = "owner")
    private Owner owner;

    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="extraction_id")
    private Extraction extraction;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OilProduct> oilProductList;
}
