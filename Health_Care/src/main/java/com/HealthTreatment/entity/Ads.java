package com.HealthTreatment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Ads {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	Long contact;
	
	@OneToOne
	Address address;
	
	@OneToMany
	Treatment treatment;
	
	@OneToMany
	Facilities facilities;
}
