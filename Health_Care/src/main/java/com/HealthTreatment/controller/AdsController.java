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

import com.HealthTreatment.entity.Ads;

@RestController
@RequestMapping("/ad")
public class AdsController {

	@PostMapping("/create")
	public Ads createAds(@RequestBody Ads ads) {
		return null;
	}
	
	@GetMapping("/fetch")
	public Ads fetchAllAddress() {
		return null;
	}
	
	@GetMapping("/fetch/{id}")
	public Ads fetchAdsById(@RequestParam Long id) {
		return null;
	}

	@PutMapping("/update/{id}")
	public Ads updateAdsById(@RequestParam Long id) {
		return null;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteAddressByID(@PathVariable Long id) {
		return null;
	}
}
