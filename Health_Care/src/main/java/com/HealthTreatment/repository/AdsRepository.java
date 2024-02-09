package com.HealthTreatment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HealthTreatment.entity.Ads;

@Repository
public interface AdsRepository extends JpaRepository<Ads, Long> {

}
