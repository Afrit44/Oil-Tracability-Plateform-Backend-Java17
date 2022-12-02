package com.Oil4Med.Oil4Med.Model;

import com.Oil4Med.Oil4Med.Model.Enum.ExtractionStatus;
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
@Table(name="Extraction")
public class Extraction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "extraction_id", nullable = false)
    private Long extractionId;

//    @Column(name = "mill_agreement_id", nullable = false)
//    private Long millAgreementId;

//    @Column(name = "machine_id", nullable = false)
//    private Long machineId;

//    @Column(name = "supply_id", nullable = false)
//    private Long supplyId;

    @Column(name = "status")
    private ExtractionStatus extractionStatus;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "finish_date")
    private Date finishDate;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OliveSupplyForExtraction> oliveSupplyForExtractionList;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="machines_id")
    private List<Machine> machines;

    @OneToOne(cascade = CascadeType.ALL)
    private ProductionBatch productionBatch;
}
