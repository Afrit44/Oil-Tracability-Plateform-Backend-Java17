package com.Oil4Med.Oil4Med.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "MillAgreement")
public class MillAgreement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "mill_agreement_id", nullable = false)
    private Long millAgreementId;

    @Column(name = "harvest_id", nullable = false)
    private Long harvestId;

    @Column(name = "olive_quantity")
    private double oliveQuantity;

    @Column(name = "mill_olive")
    private boolean millOlive;

    @Column(name = "olive_quantity_to_mill")
    private double oliveQuantityToMill;

    @Column(name = "sell_olive")
    private boolean sellOlive;

    @Column(name = "olive_quantity_to_sell")
    private double oliveQuantityToSell;

    @Column(name = "processing_date")
    private Date processingDate;

    @OneToOne(cascade = CascadeType.ALL)
    private Farmer farmer;

    @OneToOne(cascade = CascadeType.ALL)
    private MillFactory millFactory;

}
