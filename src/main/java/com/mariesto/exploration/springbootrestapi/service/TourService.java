package com.mariesto.exploration.springbootrestapi.service;

import com.mariesto.exploration.springbootrestapi.domain.Difficulty;
import com.mariesto.exploration.springbootrestapi.domain.Region;
import com.mariesto.exploration.springbootrestapi.domain.Tour;

import java.util.List;

public interface TourService {

    List<Tour> findAll();

    Tour findTourByKeywords(String keywords);

    Tour createTourWithDefinedParam(String title, String description, int parseInt, String length, String keywords, Difficulty valueOf, Region byLabel, String packageType);
}
