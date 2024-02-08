package com.HealthTreatment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Treatment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String fever;
	String coldFever;
	String headache;
	
	@ManyToOne
	Doctor doctor;
	
	@ManyToOne
	Patient patient;
	
	@ManyToOne
	Checkup checkup;
	
}
