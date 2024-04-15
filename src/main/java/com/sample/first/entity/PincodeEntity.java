package com.sample.first.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Table(name = "pincode_record")
public class PincodeEntity {

    @Id
    private String pincode;
    private Boolean activeInactive;

//    @ManyToOne
//    @JoinColumn(name = "city_id")
//    private City city;
//
//    @ManyToOne
//    @JoinColumn(name = "country_id")
//    private Country country;

}
