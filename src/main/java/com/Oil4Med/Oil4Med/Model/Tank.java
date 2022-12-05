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
    @Column(name = "machine_id", nullable = false)
    private Long machineId;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Machine> tanksMachine;

    @ManyToOne(cascade = CascadeType.ALL)
    private MillFactory tanksMillFactory;
}
