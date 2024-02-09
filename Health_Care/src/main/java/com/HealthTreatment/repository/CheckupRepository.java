package com.HealthTreatment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HealthTreatment.entity.Checkup;

@Repository
public interface CheckupRepository extends JpaRepository<Checkup, Long>{

}
