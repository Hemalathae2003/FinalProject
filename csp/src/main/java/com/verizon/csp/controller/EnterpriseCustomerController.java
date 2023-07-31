package com.verizon.csp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.csp.model.Customermodel;
import com.verizon.csp.model.EnterpriseCustomermodel;
import com.verizon.csp.repo.EnterpriseCustomerRepo;
import com.verizon.csp.service.EnterpriseCustomerService;

/*@Controller
@RequestMapping(value="/api/Enterpricecustomer",method= {RequestMethod.GET,RequestMethod.POST})*/

@RestController
@RequestMapping("/api/Enterpricecustomer")
public class EnterpriseCustomerController {
	
	//private EnterpriseCustomerRepo entprisegrepo;
	
	private EnterpriseCustomerService entpriseservice;
	
	@Autowired
	public EnterpriseCustomerController(EnterpriseCustomerService entpriseservice) {
		super();
		this.entpriseservice = entpriseservice;
	}
	
	/*
	 * @GetMapping("/createECCustomer") public String create(EnterpriseCustomermodel
	 * encustmod) { return "enterprisecustomer.html"; }
	 * 
	 * @PostMapping("/submit-enterprise-customer") public String
	 * save(EnterpriseCustomermodel encustmod) { this.entprisegrepo.save(encustmod);
	 * return "index"; }
	 */
	
	
	
	  @RequestMapping("/allepcust") public List<EnterpriseCustomermodel>
	  getAllEnterpriseCustomermodel(){ return
	  entpriseservice.getAllEnterpriseCustomermodel();
	  
	  }
	  
	  @PostMapping("/inserepcust") public EnterpriseCustomermodel
	  createEnterpriseCustomermodel(@RequestBody EnterpriseCustomermodel
	  entprisemodel) { return
	  entpriseservice.createEnterpriseCustomermodel(entprisemodel);
	  
	  }
	  
	  
	  @GetMapping("/{id}") public EnterpriseCustomermodel
	  getEnterpriseCustomermodelById(@PathVariable Integer id) { return
	  entpriseservice.getEnterpriseCustomermodelById(id);
	  
	  }
	  
	  @PostMapping("/{id}") public EnterpriseCustomermodel
	  updateEnterpriseCustomermodel(@PathVariable Integer id, @RequestBody
	  EnterpriseCustomermodel entprisemodel) { return
	  entpriseservice.updateEnterpriseCustomermodel(id,entprisemodel); }
	 
	
}
