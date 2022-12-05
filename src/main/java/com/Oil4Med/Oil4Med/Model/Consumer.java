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

    @Column(name="firstName")
    private String firstName;

    @Column(name="lastName")
    private String lastName;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @OneToMany(cascade = CascadeType.ALL)
    private List<PurchaseOil> purchaseOilListByConsumer;

    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="admin_id")
    private Admin adminCreatedConsumer;

}

