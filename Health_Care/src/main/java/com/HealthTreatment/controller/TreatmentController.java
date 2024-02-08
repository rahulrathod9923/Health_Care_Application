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

import com.HealthTreatment.entity.Treatment;

@RestController
@RequestMapping("/treatment")
public class TreatmentController {

	@PostMapping("/create")
	public Treatment createTreatment(@RequestBody Treatment address) {
		return null;
	}
	
	@GetMapping("/fetch")
	public Treatment fetchAllTreatment() {
		return null;
	}
	
	@GetMapping("/fetch/{id}")
	public Treatment fetchTreatmentById(@RequestParam Long id) {
		return null;
	}

	@PutMapping("/update/{id}")
	public Treatment updateTreatmentById(@RequestParam Long id) {
		return null;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteTreatmentByID(@PathVariable Long id) {
		return null;
	}
}
