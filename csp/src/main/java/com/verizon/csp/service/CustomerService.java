package com.verizon.csp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.csp.model.Customermodel;

import com.verizon.csp.repo.Customerrepo;


@Service
public class CustomerService {
	
private final Customerrepo custrepo;
	
	@Autowired
	public CustomerService(Customerrepo custrepo) {
		// TODO Auto-generated constructor stub
		this.custrepo = custrepo;
	}
	
	public List<Customermodel> getAllCustomermodel(){
		return custrepo.findAll();
	}
	
	public Customermodel createCustomermodel(Customermodel customermodel) {
		
		return custrepo.save(customermodel);
	}
	
	

}
