package com.HealthTreatment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.HealthTreatment.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	AddressService addressService;
	
	@PostMapping("/create")
	public Address createAddress(@RequestBody Address address) {
		return addressService.createAddress(address);
	}
	
	@GetMapping("/fetch")
	public List<Address> fetchAllAddress() {
		return addressService.fetchAllAddress();
	}
	
	@GetMapping("/fetch/{id}")
	public Address fetchAddressByyId(@RequestParam Long id) {
		return addressService.fetchAddressByyId(id);
	}

	@PutMapping("/update/{id}")
	public Address updateAddressByyId(@RequestParam Long id) {
		return addressService.updateAddressByyId(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteAddressByID(@PathVariable Long id) {
		return addressService.deleteAddressByID(id);
	}
}
