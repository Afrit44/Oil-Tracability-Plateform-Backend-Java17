package com.Oil4Med.Oil4Med.Model;

import com.Oil4Med.Oil4Med.Model.Enum.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="OilProduct")
public class OilProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "oil_product_id", nullable = false)
    private Long oilProductId;

    @Column(name = "production_id", nullable = false)
    private Long productionId;

    @Column(name = "oil_class")
    private OilClass oilClass;

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

//    @Column(name = "owner_id", nullable = false)
//   private Long ownerId;

    @Column(name = "oil_quantity")
    private double oilQuantity;

    @Column(name = "matricule")
    private String matricule;

    @Column(name = "packaging_type")
    private TypeOfPackaging typeOfPackaging;

    @Column(name = "oil_product_state")
    private OilProductState oilProductState;

    @Column(name = "storing_state")
    private boolean isStored;

    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="production_batch_id")
    private OilProductionBatch oilProductionBatch;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<PackagingOperation> packagingOperationList;

    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name="pucharse_oil_id")
    private List<PurchaseOil> purchaseOilList;

    @ManyToOne(cascade = CascadeType.ALL)
    private StorageArea storageArea;

}
