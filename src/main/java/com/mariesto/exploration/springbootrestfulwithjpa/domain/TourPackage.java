package com.mariesto.exploration.springbootrestfulwithjpa.domain;

import lombok.AllArgsConstructor;
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
@AllArgsConstructor
@NoArgsConstructor
public class TourPackage implements Serializable {

    @Id
    private String code;

    @Column
    private String name;

    @OneToMany(mappedBy = "tourPackage")
    private List<TourPackage> tourPackages;

    public TourPackage(String code, String name) {
        super();
        this.code = code;
        this.name = name;
    }
}
