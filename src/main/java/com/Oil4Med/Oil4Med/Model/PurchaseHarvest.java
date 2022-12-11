package com.Oil4Med.Oil4Med.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="PurchaseHarvest")
public class PurchaseHarvest implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "purchaseHarvestId", nullable = false)
    private Long purchaseHId;

    @Column(name = "buyer_id", nullable = false)
    private String buyerId;

    @Column(name = "quantity")
    private double quantity;

    @ManyToOne
    @JoinColumn(name = "millId",nullable = false,referencedColumnName = "millId")
    private MillFactory millFactory;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "harvestId",nullable = false,referencedColumnName = "harvestId")
    private OliveHarvest oliveHarvest;
}
