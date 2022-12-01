package com.Oil4Med.Oil4Med.Model;

import com.Oil4Med.Oil4Med.Model.Enum.Buyer;
import com.Oil4Med.Oil4Med.Model.Enum.Seller;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="PurchaseOil")
public class PurchaseOil {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "purchase_id", nullable = false)
    private Long purchaseId;

    @Column(name = "buyer_id", nullable = false)
    private Long buyerId;

    @Column(name = "seller_id", nullable = false)
    private Long sellerId;

    @Column(name = "seller_type")
    private Buyer buyerType;

    @Column(name = "seller_type")
    private Seller sellerType;

    @Column(name = "bottled")
    private boolean bottled;

    @Column(name = "quantity")
    private double quantity;

    @ManyToOne
    @JoinColumn(name="storage_area_id")
    private StorageArea storageArea;

    @ManyToOne
    @JoinColumn(name="consumer_id")
    private Consumer consumer;

    @OneToMany
    private List<UnpackedOil> unpackedOilList;
}
