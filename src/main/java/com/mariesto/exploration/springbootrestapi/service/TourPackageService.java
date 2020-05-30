package com.mariesto.exploration.springbootrestapi.service;

import com.mariesto.exploration.springbootrestapi.domain.TourPackage;

import java.util.List;

public interface TourPackageService {

    List<TourPackage> findAll();

    TourPackage createTourPackage(TourPackage tourPackage);

    long total();

}
