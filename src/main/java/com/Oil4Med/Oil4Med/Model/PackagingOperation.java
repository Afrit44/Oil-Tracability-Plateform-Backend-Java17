package com.Oil4Med.Oil4Med.Model;

import com.Oil4Med.Oil4Med.Model.Enum.CarType;
import com.Oil4Med.Oil4Med.Model.Enum.OilProductState;
import com.Oil4Med.Oil4Med.Model.Enum.TypeOfPackaging;
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
@Table(name="PackagingOperation")
public class PackagingOperation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "packaging_id", nullable = false)
    private Long packagingId;

    /*@Column(name = "oil_id", nullable = false)
    private Long oilId;*/

    @Column(name = "packaging_date")
    private Date packagingDate;

    @Column(name = "type_of_package")
    private List<TypeOfPackaging> typeOfPackagingList;

    @Column(name = "transport_date")
    private Date transportDate;

    @Column(name = "car_type")
    private CarType carType;

    @Column(name = "matricule")
    private String matricule;


    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name="unpakced_oil_id")
    private List<OilProduct> oilProductList;

//    @OneToMany(cascade = CascadeType.ALL)
//    private List<String> storageAreas;
}
