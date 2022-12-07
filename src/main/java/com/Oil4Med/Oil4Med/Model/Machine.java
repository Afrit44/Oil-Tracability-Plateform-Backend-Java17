package com.Oil4Med.Oil4Med.Model;

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
@Table(name="Machine")
public class Machine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "machine_id", nullable = false)
    private Long machineId;

    @Column(name="marque")
    private String marque;

    @Column(name="constructor")
    private String constructor;

    @Column(name="purchaseDate")
    private Date purchaseDate;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Extraction> extractions;

    @ManyToOne
    @JoinColumn(name = "millId",nullable = false,referencedColumnName = "millId")
    private MillFactory millFactory;

    @ManyToOne
    @JoinColumn(name = "tankId",nullable = false,referencedColumnName = "tankId")
    private Tank tank;
}
