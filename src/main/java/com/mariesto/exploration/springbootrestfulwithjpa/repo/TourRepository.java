package com.mariesto.exploration.springbootrestfulwithjpa.repo;

import com.mariesto.exploration.springbootrestfulwithjpa.domain.Tour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourRepository extends JpaRepository<Tour, Integer> {
}
