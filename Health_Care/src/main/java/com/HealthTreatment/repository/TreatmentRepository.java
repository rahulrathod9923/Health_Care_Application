package com.HealthTreatment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HealthTreatment.entity.Treatment;

@Repository
public interface TreatmentRepository extends JpaRepository<Treatment, Long>{

}
