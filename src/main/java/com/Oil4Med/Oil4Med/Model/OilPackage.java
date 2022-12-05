package com.Oil4Med.Oil4Med.Model;

import com.Oil4Med.Oil4Med.Model.Enum.CarType;
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
@Table(name="OilPackage")
public class OilPackage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "oil_package_id", nullable = false)
    private Long oilPackageId;

    @Column(name = "oil_id", nullable = false)
    private Long oilId;

    @Column(name = "transport_date")
    private Date transportDate;

    @Column(name = "car_type")
    private CarType carType;

    @Column(name = "matricule")
    private String matricule;

    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="unpakced_oil_id")
    private UnpackedOil unpackedOil;

//    @OneToMany(cascade = CascadeType.ALL)
//    private List<String> storageAreas;
}
