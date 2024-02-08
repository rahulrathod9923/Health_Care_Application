package com.HealthTreatment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Facilities {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	String hospitalSize;
	
	String doctorType;
	
	@ManyToOne
	Doctor doctor;
}
