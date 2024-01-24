package com.example.address.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.address.Entity.Address;
@Service
public class AddresServiceImpl implements AddressService {
	List<Address>list=List.of(
			new Address(101, "Amaravati", 444604, 2),
			new Address(102, "baramati", 413102, 1),
			new Address(103, "pune", 444614, 3)
			
			);
	@Override
	public List<Address> getAddressofstudent(int stuid) {
		// TODO Auto-generated method stub
		return list.stream().filter(address -> address.getStuid()==stuid).collect(Collectors.toList());
	}

}
