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
@Table(name="Farmer")
public class Farmer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "farmer_id", nullable = false)
    private Long farmerId;


    @ManyToOne
    @JoinColumn(name="admin_id")
    private Admin admin;

    @OneToMany
    private List<OliveGrove> oliveGroves;

    @OneToOne
    @JoinColumn(name="mill_agreement_id")
    private MillAgreement millAgreement;

}
