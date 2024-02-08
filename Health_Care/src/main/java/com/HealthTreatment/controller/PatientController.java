package com.HealthTreatment.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.HealthTreatment.entity.Patient;

@RestController
@RequestMapping("/patient")
public class PatientController {

	@PostMapping("/create")
	public Patient createPatient(@RequestBody Patient address) {
		return null;
	}
	
	@GetMapping("/fetch")
	public Patient fetchAllPatient() {
		return null;
	}
	
	@GetMapping("/fetch/{id}")
	public Patient fetchPatientById(@RequestParam Long id) {
		return null;
	}

	@PutMapping("/update/{id}")
	public Patient updatePatientById(@RequestParam Long id) {
		return null;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletePatientByID(@PathVariable Long id) {
		return null;
	}
}
