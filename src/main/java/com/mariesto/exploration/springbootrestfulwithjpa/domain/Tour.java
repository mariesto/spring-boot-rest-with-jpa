package com.mariesto.exploration.springbootrestfulwithjpa.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Tour implements Serializable {

    @Id
    @GeneratedValue
    public Integer id;

    @ManyToOne
    @JoinColumn
    public TourPackage tourPackage;

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

    @Column
    public Difficulty difficulty;

    @Column
    public Region region;

    public Tour(String title, String description, Integer price, String duration, String keyword) {
    }
}
