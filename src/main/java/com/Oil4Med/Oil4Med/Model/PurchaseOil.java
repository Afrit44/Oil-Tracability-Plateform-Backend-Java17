package com.Oil4Med.Oil4Med.Model;

import com.Oil4Med.Oil4Med.Model.Types.Person;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private Person buyerType;

    @Column(name = "seller_type")
    private Person sellerType;

    @Column(name = "bottled")
    private boolean bottled;

    @Column(name = "quantity")
    private double quantity;

}
