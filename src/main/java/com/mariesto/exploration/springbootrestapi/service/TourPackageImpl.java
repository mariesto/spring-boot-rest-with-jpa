package com.mariesto.exploration.springbootrestapi.service;

import com.mariesto.exploration.springbootrestapi.domain.TourPackage;
import com.mariesto.exploration.springbootrestapi.repo.TourPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourPackageImpl implements TourPackageService {
    private TourPackageRepository tourPackageRepository;

    @Autowired
    public TourPackageImpl(TourPackageRepository tourPackageRepository) {
        this.tourPackageRepository = tourPackageRepository;
    }

    @Override
    public TourPackage createTourPackage(TourPackage tourPackage){
        return tourPackageRepository.save(tourPackage);
    }

    @Override
    public List<TourPackage> findAll() {
        return tourPackageRepository.findAll();
    }

    @Override
    public long total(){
        return tourPackageRepository.count();
    }
}
