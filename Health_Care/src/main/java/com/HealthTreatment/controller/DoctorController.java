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

import com.HealthTreatment.entity.Doctor;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

	@PostMapping("/create")
	public Doctor createDoctor(@RequestBody Doctor address) {
		return null;
	}
	
	@GetMapping("/fetch")
	public Doctor fetchAllDoctor() {
		return null;
	}
	
	@GetMapping("/fetch/{id}")
	public Doctor fetchDoctorById(@RequestParam Long id) {
		return null;
	}

	@PutMapping("/update/{id}")
	public Doctor updateDoctorById(@RequestParam Long id) {
		return null;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteDoctorByID(@PathVariable Long id) {
		return null;
	}
}
