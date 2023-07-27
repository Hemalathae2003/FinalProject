package com.verizon.csp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.csp.model.EnterpriseCustomermodel;

import com.verizon.csp.service.EnterpriseCustomerService;

@RestController
@RequestMapping("/api/Enterpricecustomer")
public class EnterpriseCustomerController {
	
	private EnterpriseCustomerService entpriseservice;
	
	@Autowired
	public EnterpriseCustomerController(EnterpriseCustomerService entpriseservice) {
		super();
		this.entpriseservice = entpriseservice;
	}
	
	@RequestMapping("/allepcust")
	public List<EnterpriseCustomermodel> getAllEnterpriseCustomermodel(){
		return entpriseservice.getAllEnterpriseCustomermodel();
		
	}
	
	@PostMapping("/inserepcust")
	public EnterpriseCustomermodel createEnterpriseCustomermodel(@RequestBody EnterpriseCustomermodel entprisemodel)
	{
		return entpriseservice.createEnterpriseCustomermodel(entprisemodel);

}

	
	
}
