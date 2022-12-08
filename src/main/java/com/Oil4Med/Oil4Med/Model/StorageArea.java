package com.Oil4Med.Oil4Med.Model;

import com.Oil4Med.Oil4Med.Model.Enum.LocalType;
import com.Oil4Med.Oil4Med.Model.Types.Address;
import com.Oil4Med.Oil4Med.Model.Types.Humidity;
import com.Oil4Med.Oil4Med.Model.Types.Temperature;
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

    @Column(name = "owner")
    private String owner;

    @Column(name = "local_type")
    private LocalType localType;

    @Embedded
    @Column(name = "temperature")
    private Temperature temperature;

    @Embedded
    @Column(name = "humidity")
    private Humidity humidity;

    @Embedded
    @Column(name = "address")
    private Address address;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "storageArea")
    private List<OilProduct> listOfOilProduct;

}
