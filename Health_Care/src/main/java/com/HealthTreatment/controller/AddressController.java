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

import com.HealthTreatment.entity.Address;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	@PostMapping("/create")
	public Address createAddress(@RequestBody Address address) {
		return null;
	}
	
	@GetMapping("/fetch")
	public Address fetchAllAddress() {
		return null;
	}
	
	@GetMapping("/fetch/{id}")
	public Address fetchAddressByyId(@RequestParam Long id) {
		return null;
	}

	@PutMapping("/update/{id}")
	public Address updateAddressByyId(@RequestParam Long id) {
		return null;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteAddressByID(@PathVariable Long id) {
		return null;
	}
}
