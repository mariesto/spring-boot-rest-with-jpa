package com.mariesto.exploration.springbootrestfulwithjpa.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter @Setter @NoArgsConstructor
public class TourPackage implements Serializable {

    @Id
    private String code;

    @Column
    private String name;

}
