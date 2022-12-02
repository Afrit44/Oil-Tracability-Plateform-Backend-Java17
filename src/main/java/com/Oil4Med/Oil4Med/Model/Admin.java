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
@Table(name="Admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "admin_id", nullable = false)
    private Long adminId;

    @OneToMany(mappedBy = "admin",cascade = CascadeType.ALL)
    private List<Farmer> farmersCreated;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Consumer> consumersCreated;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Mill> millsCreated;

}
