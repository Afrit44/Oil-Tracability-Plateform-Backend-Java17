package com.Oil4Med.Oil4Med.Model.Types;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Address {

    private int postalCode;

    private String city;

    private String district;

    private String street;

}
