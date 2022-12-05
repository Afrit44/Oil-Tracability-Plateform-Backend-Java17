package com.Oil4Med.Oil4Med.Model;

import com.Oil4Med.Oil4Med.Model.Enum.AnalysisType;
import com.Oil4Med.Oil4Med.Model.Enum.OilClass;
import com.Oil4Med.Oil4Med.Model.Enum.OilProductState;
import com.Oil4Med.Oil4Med.Model.Enum.TypeOfPackaging;
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
    @Column(name = "unpacked_oil_id", nullable = false)
    private Long OilId;

    @Column(name = "production_id", nullable = false)
    private Long productionId;

    @Column(name = "oil_class")
    private OilClass oilClass;

    @Column(name = "analysis_type")
    private AnalysisType analysisType;

//    @Column(name = "owner_id", nullable = false)
    private Long ownerId;

    @Column(name = "oil_quantity")
    private double oilQuantity;

    @Column(name = "matricule")
    private String matricule;

    @Column(name = "packaging_type")
    private TypeOfPackaging typeOfPackaging;

    @Column(name = "oil_product_state")
    private OilProductState oilProductState;

    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="production_batch_id")
    private ProductionBatch productionBatch;

    @ManyToOne(cascade = CascadeType.ALL)
    private PackagingOperation packagingOperation;

    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name="pucharse_oil_id")
    private List<PurchaseOil> purchaseOilList;

}
