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
import com.verizon.csp.model.Ordermodel;
import com.verizon.csp.model.Servicemodel;
import com.verizon.csp.repo.Servicerepo;
import com.verizon.csp.service.Servicee;

/*@Controller
@RequestMapping(value="/api/service",method= {RequestMethod.GET,RequestMethod.POST})*/
@RestController
@RequestMapping("/api/service")

public class ServiceController {
	
private Servicee service;
	//private  Servicerepo servrepo;
	
	@Autowired
	public ServiceController( Servicee service) {
		
		this.service = service;
	}
	
	
	/*
	 * @GetMapping("/create") public String create(Servicerepo servrepo) { return
	 * "Service.html" ; }
	 * 
	 * @PostMapping("/submit-service") public String save(Servicemodel servmod) {
	 * this.servrepo.save(servmod); return "index";
	 * 
	 * }
	 */
	
	
	
	
	
	  @RequestMapping("/allservice") public List<Servicemodel>
	  getAllServicemodel(){ return service.getAllServicemodel();
	  
	  
	  }
	  
	  @PostMapping("/insertservice") public Servicemodel
	  createServicemodel(@RequestBody Servicemodel servicemodel) { return
	  service.createServicemodel(servicemodel);
	  
	  }
	  
	  
	  @GetMapping("/{id}") public Servicemodel getServicemodelById(@PathVariable
	  Integer id) { return service.getServicemodelById(id);
	  
	  }
	  
	  
	  @PostMapping("/{id}") public Servicemodel updateServicemodel(@PathVariable
	  Integer id, @RequestBody Servicemodel servicemodel) { return
	  service.updateServicemodel(id,servicemodel); }
	 
	
	
	
	
	
	


}
