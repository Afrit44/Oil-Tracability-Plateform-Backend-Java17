package com.Oil4Med.Oil4Med.Model;

import com.Oil4Med.Oil4Med.Model.Enum.AnalysisType;
import com.Oil4Med.Oil4Med.Model.Enum.CarType;
import com.Oil4Med.Oil4Med.Model.Enum.OilClass;
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
@Table(name="UnpackedOil")
public class UnpackedOil {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "unpacked_oil_id", nullable = false)
    private Long unpackedOilId;

    @Column(name = "production_id", nullable = false)
    private Long productionId;

    @Column(name = "oil_class")
    private OilClass oilClass;

    @Column(name = "analysis_type")
    private AnalysisType analysisType;

//    @Column(name = "owner_id", nullable = false)
    private Long ownerId;

    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="production_batch_id")
    private ProductionBatch productionBatch;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OilPackage> oilPackageList;

    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="pucharse_oil_id")
    private PurchaseOil purchaseOil;

}
