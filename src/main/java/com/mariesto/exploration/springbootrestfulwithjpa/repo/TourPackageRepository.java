package com.mariesto.exploration.springbootrestfulwithjpa.repo;

import com.mariesto.exploration.springbootrestfulwithjpa.domain.TourPackage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourPackageRepository extends JpaRepository<TourPackage, String> {
}
