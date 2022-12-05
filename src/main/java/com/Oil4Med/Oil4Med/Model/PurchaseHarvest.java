package com.Oil4Med.Oil4Med.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="PurchaseHarvest")
public class PurchaseHarvest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "purchaseH_id", nullable = false)
    private Long purchaseHId;

    @Column(name = "harvest_id", nullable = false)
    private String harvestId;

    @Column(name = "buyer_id", nullable = false)
    private String buyerId;

    @Column(name = "quantity")
    private double quantity;

    @ManyToOne(cascade = CascadeType.ALL)
    private MillFactory millFactory;

    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="olive_harvest_id")
    private OliveHarvest oliveHarvest;
}
