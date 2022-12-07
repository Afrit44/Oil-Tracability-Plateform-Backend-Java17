package com.Oil4Med.Oil4Med.Model;

import com.Oil4Med.Oil4Med.Model.Types.Address;
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

    @Column(name="firstName")
    private String firstName;

    @Column(name="lastName")
    private String lastName;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name="phone_Number")
    private String phoneNumber;

    @Embedded
    @Column(name = "Address")
    private Address address;

    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="admin_id")
    private Admin admin;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OliveGrove> oliveGroves;

    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name="mill_agreement_id")
    private List<MillAgreement> millAgreementList;

}
