package com.mariesto.exploration.springbootrestfulwithjpa.service;

import com.mariesto.exploration.springbootrestfulwithjpa.domain.Difficulty;
import com.mariesto.exploration.springbootrestfulwithjpa.domain.Region;
import com.mariesto.exploration.springbootrestfulwithjpa.domain.Tour;
import com.mariesto.exploration.springbootrestfulwithjpa.domain.TourPackage;
import com.mariesto.exploration.springbootrestfulwithjpa.repo.TourPackageRepository;
import com.mariesto.exploration.springbootrestfulwithjpa.repo.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.Optional;

@Service
public class TourService {

    private TourRepository tourRepository;
    private TourPackageRepository tourPackageRepository;

    @Autowired
    public TourService(TourRepository tourRepository, TourPackageRepository tourPackageRepository) {
        this.tourRepository = tourRepository;
        this.tourPackageRepository = tourPackageRepository;
    }

    private Tour createTour(String title, String description, Integer price, String duration, String keywords, String tourPackageCode, Difficulty difficulty, Region region) throws Exception {
        TourPackage tourPackage = tourPackageRepository.getOne(tourPackageCode);
        if(ObjectUtils.isEmpty(tourPackage)){
            throw new Exception("Tour Package does not exist");
        }

        return tourRepository.save(new Tour(title, description, price, duration, keywords, difficulty, region));
    }

    private Iterable<Tour> lookup(){
        return tourRepository.findAll();
    }

    private long total(){
        return tourRepository.count();
    }
}
