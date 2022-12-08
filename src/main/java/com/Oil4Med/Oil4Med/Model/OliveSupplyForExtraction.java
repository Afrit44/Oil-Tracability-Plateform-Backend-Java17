package com.Oil4Med.Oil4Med.Model;

import com.Oil4Med.Oil4Med.Model.Enum.ExtractionType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="OliveSupplyForExtraction")
public class OliveSupplyForExtraction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "supply_id", nullable = false)
    private Long supplyId;

    @Column(name = "weight")
    private double weight;

    @Column(name = "extractionType")
    private ExtractionType extractionType;

    @ManyToOne
    @JoinColumn(name="harvestId",nullable = false,referencedColumnName = "harvestId")
    private OliveHarvest oliveHarvest;

    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name="extraction_id")
    private List<Extraction> extractionList;
}
