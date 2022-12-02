package com.Oil4Med.Oil4Med.Model;

import com.Oil4Med.Oil4Med.Model.Types.Address;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Mill")
public class Mill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "mill_id", nullable = false)
    private Long millId;

    @Embedded
    @Column(name = "address")
    private Address address;

    @Column(name = "year_of_creation")
    private int yearOfCreation;

    @Column(name = "milling_capacity")
    private double millingCapacity;

    @Column(name = "storing_mean")
    private String storingMean;

    @Column(name = "container_type")
    private String containerType;

    @Column(name = "maintenance")
    private String maintenance;

    @Column(name = "number_of_phases")
    private int numberOfPhases;

    @Column(name = "number_of_grinders")
    private int numberOfGrinders;

    @Column(name = "avg_crush_time_per_Tonne")
    private double avgCrushTimePerTonne;

    @Column(name = "water_per_100kg")
    private double waterPer100Kg;

    @Column(name = "avg_mixing_time")
    private double avgMixingTime;

    @Column(name = "press_temperature")
    private double pressTemperature;

    @Column(name = "filtration")
    private boolean Filtration;

    @Column(name = "cleaning_products")
    private String cleaningProducts;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="admin_id")
    private Admin admin;

    @OneToMany(cascade = CascadeType.ALL)
    private List<PurchaseHarvest> purchaseHarvestList;

    @OneToOne(cascade = CascadeType.ALL)
    private MillAgreement millAgreement;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="machines_id")
    private List<Machine> machines;
}
