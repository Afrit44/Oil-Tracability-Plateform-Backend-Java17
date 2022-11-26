package com.Oil4Med.Oil4Med.Model;

import com.Oil4Med.Oil4Med.Model.Enum.OliveMaturity;
import com.Oil4Med.Oil4Med.Model.Enum.State;
import com.Oil4Med.Oil4Med.Model.Enum.MethodOfHarvest;
import com.Oil4Med.Oil4Med.Model.Enum.TypeOfPackaging;
import com.Oil4Med.Oil4Med.Model.Types.Address;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

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

    @Column(name = "owner_address")
    private Address address;

    @Column(name = "extraction_id")
    private Long extractionId;

}
