package com.Oil4Med.Oil4Med.Model;

import com.Oil4Med.Oil4Med.Model.Enum.ExtractionStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Extraction")
public class Extraction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "extraction_id", nullable = false)
    private Long extractionId;

    @Column(name = "status")
    private ExtractionStatus extractionStatus;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "finish_date")
    private Date finishDate;

    @Column(name = "Water_per_100Kg")
    private double waterPer100Kg;

    @Column(name = "average_mixing_time")
    private double averageMixingTime;

    @Column(name = "press_temperature")
    private double pressTemperature;

    @Column(name = "filtration")
    private boolean filtration;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<OliveSupplyForExtraction> oliveSupplyForExtractionList;

    @ManyToMany
//    @JoinColumn(name="machines_id")
    private Set<Machine> machines;

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "extraction")
    private OilProductionBatch oilProductionBatch;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "extraction")
    private List<MillAgreement> millAgreementList;
}
