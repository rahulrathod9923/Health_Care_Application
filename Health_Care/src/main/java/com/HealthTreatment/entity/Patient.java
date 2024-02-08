package com.HealthTreatment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;

	String name;

	Long contact;

	String desease;

	@OneToMany
	Treatment treatment;

	@OneToOne
	Address address;

	@OneToOne
	Appointment appointment;

}
