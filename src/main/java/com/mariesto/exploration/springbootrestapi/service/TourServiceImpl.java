package com.mariesto.exploration.springbootrestapi.service;

import com.mariesto.exploration.springbootrestapi.domain.Difficulty;
import com.mariesto.exploration.springbootrestapi.domain.Region;
import com.mariesto.exploration.springbootrestapi.domain.Tour;
import com.mariesto.exploration.springbootrestapi.domain.TourPackage;
import com.mariesto.exploration.springbootrestapi.repo.TourPackageRepository;
import com.mariesto.exploration.springbootrestapi.repo.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class TourServiceImpl implements TourService {

    private TourRepository tourRepository;
    private TourPackageRepository tourPackageRepository;

    @Autowired
    public TourServiceImpl(TourRepository tourRepository, TourPackageRepository tourPackageRepository) {
        this.tourRepository = tourRepository;
        this.tourPackageRepository = tourPackageRepository;
    }

    @Override
    public List<Tour> findAll() {
        return tourRepository.findAll();
    }

    @Override
    public Tour findTourByKeywords(String keywords) {
        return Optional.ofNullable(tourRepository.findByKeywordsLike(keywords))
                .orElseThrow(NullPointerException::new);
    }

    @Override
    public Tour createTourWithDefinedParam(String title, String description, int price, String length, String keywords, Difficulty difficulty, Region region, String packageType) {
        TourPackage tourPackage = tourPackageRepository.findByName(packageType);

        if(tourPackage == null){
            throw new NoSuchElementException("Tour packages does not exist");
        }

        return Optional.ofNullable(tourRepository.findByTitle(title))
                .orElseGet(() -> tourRepository.save(new Tour(title, description, price, length, keywords, difficulty, region)));
    }
}
