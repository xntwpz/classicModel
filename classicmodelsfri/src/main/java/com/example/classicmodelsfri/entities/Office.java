package com.example.classicmodelsfri.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter //5
@Setter
@ToString(exclude = {"territory", "addressLine2", "postalCode"})
@Entity //1
@Table(name = "Office") //2
@NamedQueries({
        @NamedQuery(name = "OFFICE.FIND_ALL", query = "select o from Office o"),
        @NamedQuery(name = "OFFICE.FIND_BY_COUNTRY",
                query = "select o from Office o where o.country like :countryParam")})
public class Office {
    @Id //3
    private String officeCode; //4 column in database
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String country;
    private String postalCode;
    private String phone;
    private String territory;
}
