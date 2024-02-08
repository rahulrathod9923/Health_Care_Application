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

import com.HealthTreatment.entity.Checkup;

@RestController
@RequestMapping("/checkup")
public class CheckupController {

	@PostMapping("/create")
	public Checkup createCheckup(@RequestBody Checkup address) {
		return null;
	}
	
	@GetMapping("/fetch")
	public Checkup fetchAllCheckup() {
		return null;
	}
	
	@GetMapping("/fetch/{id}")
	public Checkup fetchCheckupById(@RequestParam Long id) {
		return null;
	}

	@PutMapping("/update/{id}")
	public Checkup updateCheckupById(@RequestParam Long id) {
		return null;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteCheckupByID(@PathVariable Long id) {
		return null;
	}
}
