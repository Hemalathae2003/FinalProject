package com.verizon.csp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.csp.model.Customermodel;

import com.verizon.csp.service.CustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

	private CustomerService custservice;
	
	@Autowired
	public CustomerController(CustomerService custservice) {
		super();
		this.custservice = custservice;
	}
	
	@RequestMapping("/allcustomer")
	public List<Customermodel> getAllCustomermodel(){
		return custservice.getAllCustomermodel();
		
	}
	
	@PostMapping("/insercustomer")
	public Customermodel createCustomermodel(@RequestBody Customermodel custmodel)
	{
		return custservice.createCustomermodel(custmodel);

}
}
