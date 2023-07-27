package com.verizon.csp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.verizon.csp.model.Servicemodel;

import com.verizon.csp.service.Servicee;

@RestController
@RequestMapping("/api/service")
public class ServiceController {
	
private Servicee service;
	
	@Autowired
	public ServiceController(Servicee service) {
		
		this.service = service;
	}
	
	@RequestMapping("/allservice")
	public List<Servicemodel> getAllServicemodel(){
		return service.getAllServicemodel();
		
		
	}
	
	@PostMapping("/insertservice")
	public Servicemodel createServicemodel(@RequestBody Servicemodel servicemodel)
	{
		return service.createServicemodel(servicemodel);

}

}
