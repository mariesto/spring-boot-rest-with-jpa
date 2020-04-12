package com.mariesto.exploration.springbootrestfulwithjpa.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TourPackage implements Serializable {

    @Id
    private String code;

    @Column
    private String name;

}
