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
@Table(name="Consumer")
public class Consumer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "consumer_id", nullable = false)
    private Long consumerId;

    @Column(name="name")
    private String name;

    @OneToMany
    private List<PurchaseOil> purchaseOilList;

    @ManyToOne
    @JoinColumn(name="admin_id")
    private Admin admin;

}

