package com.Oil4Med.Oil4Med.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Tank")
public class Tank {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tank_id", nullable = false)
    private Long tankId;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "tank")
    private List<Machine> machines;

    @ManyToOne
    @JoinColumn(name = "millId",nullable = false,referencedColumnName = "millId")
    private MillFactory tanksMillFactory;
}
