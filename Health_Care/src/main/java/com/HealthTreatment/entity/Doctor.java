package com.HealthTreatment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Doctor {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	String name;
	
	Long contact;
		
	@OneToMany
	Checkup checkup;
	
	@OneToOne
	Address address;
	
	@OneToMany
	Appointment appointment;
	
	@OneToMany
	Treatment treatment;
	
	@OneToMany
	Facilities facilities;
	
	@OneToMany
	Ads ads;
}
