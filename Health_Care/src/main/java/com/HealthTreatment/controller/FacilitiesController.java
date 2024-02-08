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

import com.HealthTreatment.entity.Facilities;

@RestController
@RequestMapping("/facilities")
public class FacilitiesController {

	@PostMapping("/create")
	public Facilities createFacilities(@RequestBody Facilities address) {
		return null;
	}
	
	@GetMapping("/fetch")
	public Facilities fetchAllFacilities() {
		return null;
	}
	
	@GetMapping("/fetch/{id}")
	public Facilities fetchFacilitiesById(@RequestParam Long id) {
		return null;
	}

	@PutMapping("/update/{id}")
	public Facilities updateFacilitiesById(@RequestParam Long id) {
		return null;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteFacilitiesByID(@PathVariable Long id) {
		return null;
	}
}
