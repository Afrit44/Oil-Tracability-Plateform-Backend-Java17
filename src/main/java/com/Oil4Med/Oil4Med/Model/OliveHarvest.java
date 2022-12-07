package com.Oil4Med.Oil4Med.Model;

import com.Oil4Med.Oil4Med.Model.Enum.*;
import com.Oil4Med.Oil4Med.Model.Types.Address;
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
@Table(name="OliveHarvest")
public class OliveHarvest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "harvest_id", nullable = false)
    private Long harvestId;

    @Column(name = "grove_id", nullable = false)
    private Long groveId;

    @Column(name = "harvesting_date")
    private Date harvestingDate;

    @Column(name = "harvest_type")
    private MethodOfHarvest harvestType;

    @Column(name = "maturity")
    private OliveMaturity maturity;

    @Column(name = "production_per_hectare")
    private double productionPerHectare;

    @Column(name = "production_per_tree_per_year")
    private double productionPerTreePerYear;

    @Column(name = "avg_transport_before_mill")
    private int avgTransportBeforeMill;

    //What packaging?
    @Column(name = "packaging")
    private TypeOfPackaging packaging;

    @Column(name = "frequency_of_production")
    private double frequencyOfProduction;

    @Column(name = "separation")
    private boolean separation;

    @Column(name = "harvest_for_sale")
    private boolean harvestForSale;

    @Column(name = "price")
    private double price;

    @Column(name = "state")
    private State state;

    @Embedded
    @Column(name = "owner_address")
    private Address address;

    //why???
    @Column(name = "extraction_id")
    private Long extractionId;

    @Column(name = "transport_to_mill_date")
    private Date transportToMillDate;

    @Column(name = "car_type")
    private CarType carType;

    @Column(name = "matricule")
    private String matricule;

    @ManyToOne(cascade = CascadeType.ALL)
    private OliveGrove oliveGrove;

    @OneToMany(cascade = CascadeType.ALL)
    @ElementCollection(targetClass= OliveSupplyForExtraction.class)
    private List<OliveSupplyForExtraction> oliveSupplyForExtractionList;

    @OneToOne(cascade = CascadeType.ALL)
    private PurchaseHarvest purchaseHarvest;

}
