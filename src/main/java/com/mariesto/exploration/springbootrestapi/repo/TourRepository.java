package com.mariesto.exploration.springbootrestapi.repo;

import com.mariesto.exploration.springbootrestapi.domain.Tour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourRepository extends JpaRepository<Tour, Integer> {
    Tour findByKeywordsLike(String keywords);
    Tour findByTitle(String title);
}
