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
import com.HealthTreatment.entity.Appointment;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

	@PostMapping("/create")
	public Appointment createppointments(@RequestBody Appointment address) {
		return null;
	}
	
	@GetMapping("/fetch")
	public Appointment fetchAllAppointment() {
		return null;
	}
	
	@GetMapping("/fetch/{id}")
	public Appointment fetchAppointmentById(@RequestParam Long id) {
		return null;
	}

	@PutMapping("/update/{id}")
	public Appointment updateAppointmentById(@RequestParam Long id) {
		return null;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteAppointmentByID(@PathVariable Long id) {
		return null;
	}
}
