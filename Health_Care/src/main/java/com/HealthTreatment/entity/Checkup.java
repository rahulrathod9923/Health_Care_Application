package com.HealthTreatment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Checkup {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	Long bloodPresure;
	
	Long bodyTemperature;
	
	@OneToMany
	Treatment treatment;
	
	@ManyToOne
	Doctor doctor;
	
	@OneToMany
	Appointment appointment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBloodPresure() {
		return bloodPresure;
	}

	public void setBloodPresure(Long bloodPresure) {
		this.bloodPresure = bloodPresure;
	}

	public Long getBodyTemperature() {
		return bodyTemperature;
	}

	public void setBodyTemperature(Long bodyTemperature) {
		this.bodyTemperature = bodyTemperature;
	}

	public Treatment getTreatment() {
		return treatment;
	}

	public void setTreatment(Treatment treatment) {
		this.treatment = treatment;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
	
}
