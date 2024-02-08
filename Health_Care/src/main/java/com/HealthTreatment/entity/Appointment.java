package com.HealthTreatment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Appointment {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	Long appointmentId;
	
	@ManyToOne
	Doctor doctor;
	
	@OneToMany
	Patient patient;
}
