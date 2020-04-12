package com.mariesto.exploration.springbootrestfulwithjpa.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
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

    public Tour(String title, String description, Integer price, String duration, String keyword) {
    }
}
