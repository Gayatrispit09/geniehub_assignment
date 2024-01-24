package com.example.address.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.address.Entity.Address;
import com.example.address.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	 @Autowired
	 private AddressService addressService;
	 
	 @GetMapping("/student/{stuid}")
	 public List<Address> getAddresses(@PathVariable("stuid") int stuid){
		 return this.addressService.getAddressofstudent(stuid);
	 }
}
