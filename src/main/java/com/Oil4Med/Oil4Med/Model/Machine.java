package com.Oil4Med.Oil4Med.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    @Column(name = "mill_id", nullable = false)
    private Long millId;
}
