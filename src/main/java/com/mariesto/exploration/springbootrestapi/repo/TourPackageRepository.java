package com.mariesto.exploration.springbootrestapi.repo;

import com.mariesto.exploration.springbootrestapi.domain.TourPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface TourPackageRepository extends JpaRepository<TourPackage, String> {
    TourPackage findByName(@Param("name") String name);
}
