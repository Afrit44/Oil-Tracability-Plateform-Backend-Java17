package com.Oil4Med.Oil4Med.Model;

import com.Oil4Med.Oil4Med.Model.Enum.LocalType;
import com.Oil4Med.Oil4Med.Model.Types.Address;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="StorageArea")
public class StorageArea {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "storage_area_id", nullable = false)
    private Long storageAreaId;

    @Column(name = "oil_package_list")
    private List<OilProduct> oilProductList;

    @Column(name = "owner")
    private String owner;

    @Column(name = "local_type")
    private LocalType localType;

//    @Column(name = "temperature")
//    private HashMap<Date,Float> temperature;
//
//    @Column(name = "humidity")
//    private HashMap<Date,Float> humidity;

    @Embedded
    @Column(name = "address")
    private Address address;

    @OneToMany(cascade = CascadeType.ALL)
    private List<PurchaseOil> listOfPurchaseOil;

}
