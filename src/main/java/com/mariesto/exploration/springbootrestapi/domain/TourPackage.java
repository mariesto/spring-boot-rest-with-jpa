package com.mariesto.exploration.springbootrestapi.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class TourPackage implements Serializable {

    @Id
    private String code;

    @Column
    private String name;

    @OneToMany(mappedBy = "tourPackage")
    private List<Tour> tours;

    public TourPackage(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
