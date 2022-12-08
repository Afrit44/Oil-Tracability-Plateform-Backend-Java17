package com.Oil4Med.Oil4Med.Model.Types;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Humidity {

    private Date date;

    private float value;

}
