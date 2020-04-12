package com.mariesto.exploration.springbootrestfulwithjpa.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Tour implements Serializable {

    @Id
    @GeneratedValue
    public Integer id;

    @Column
    public String title;

    @Column
    public String description;

    @Column
    public Integer price;

    @Column
    public String duration;

    @Column
    public String keyword;

}
