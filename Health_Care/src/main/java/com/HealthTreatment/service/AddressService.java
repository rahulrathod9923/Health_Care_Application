package com.HealthTreatment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HealthTreatment.entity.Address;
import com.HealthTreatment.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	AddressRepository addressRepository;
	
	public Address createAddress(Address address) {
		return addressRepository.save(address);
	}

	public List<Address> fetchAllAddress() {
		return addressRepository.findAll();
	}

	public Address fetchAddressByyId(Long id) {
		return addressRepository.findById(id).get();
	}

	public Address updateAddressByyId(Long id) {
//		return addressRepository.;
		return null;
	}

	public String deleteAddressByID(Long id) {
		addressRepository.deleteById(id);
		
		return "Record deleted";
	}

}
