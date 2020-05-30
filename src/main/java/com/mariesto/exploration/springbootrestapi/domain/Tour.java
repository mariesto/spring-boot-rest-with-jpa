package com.mariesto.exploration.springbootrestapi.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor

public class Tour implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column
    public String title;

    @Column(length = 2000)
    public String description;

    @Column
    public Integer price;

    @Column
    public String length;

    @Column
    public String keywords;

    @Column
    public Difficulty difficulty;

    @Column
    public Region region;

    @ManyToOne
    public TourPackage tourPackage;

    public Tour(String title, String description, Integer price, String length, String keywords, Difficulty difficulty, Region region, TourPackage tourPackage) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.length = length;
        this.keywords = keywords;
        this.difficulty = difficulty;
        this.region = region;
        this.tourPackage = tourPackage;
    }

    public Tour(String title, String description, Integer price, String length, String keywords, Difficulty difficulty, Region region) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.length = length;
        this.keywords = keywords;
        this.difficulty = difficulty;
        this.region = region;
    }

}
