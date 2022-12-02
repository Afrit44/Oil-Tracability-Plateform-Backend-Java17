package com.Oil4Med.Oil4Med.Model;

import com.Oil4Med.Oil4Med.Model.Enum.TypeOfOlive;
import com.Oil4Med.Oil4Med.Model.Enum.TypeOfSoil;
import com.Oil4Med.Oil4Med.Model.Enum.OwnershipNature;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="OliveGrove")
public class OliveGrove {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "grove_id", nullable = false)
    private Long groveId;

//    @Column(name = "farmer_id", nullable = false)
//    private String farmerId;

    @Column(name = "address")
    private String address;

    @Column(name = "ownership_nature")
    private OwnershipNature ownershipNature;

    @Column(name = "tree_age")
    private int treeAge;

    @Column(name = "total_area")
    private int totalArea;

    @Column(name = "density")
    private Double density;

    @Column(name = "variety_trees")
    private List<Enum> varietyTrees;

    @Column(name = "type_of_soil")
    private TypeOfSoil typeOfSoil;

    @Column(name = "fertilization_product")
    private List<String> fertilizationProduct;

    @Column(name = "field_picture")
    private String fieldPicture;

    @Column(name = "pesticide_sprays")
    private boolean pesticideSprays;

    @Column(name = "type")
    private TypeOfOlive type;

    @Column(name = "irrigation")
    private boolean irrigation;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="farmer_id")
    private Farmer farmer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="olive_harvest_id")
    private OliveHarvest oliveHarvest;
}
