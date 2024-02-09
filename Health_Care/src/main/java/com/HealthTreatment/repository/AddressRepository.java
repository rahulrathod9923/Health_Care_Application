package com.HealthTreatment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HealthTreatment.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
