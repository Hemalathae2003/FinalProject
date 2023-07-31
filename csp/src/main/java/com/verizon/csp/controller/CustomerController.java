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

import com.verizon.csp.model.Catalogmodel;
import com.verizon.csp.model.Customermodel;
import com.verizon.csp.repo.Customerrepo;
import com.verizon.csp.service.CustomerService;

/*@Controller
@RequestMapping(value="/api/customer",method= {RequestMethod.GET,RequestMethod.POST})*/

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

	

//private  Customerrepo custrepo;
	private CustomerService custservice;
	
	@Autowired
	public CustomerController(CustomerService custservice) {
		
		this.custservice = custservice;
	}
	
	
	/*
	 * @GetMapping("/create/customer") public String create (Customermodel custmod)
	 * { return "customer.html"; }
	 * 
	 * @PostMapping("/submit-customer") public String save(Customermodel custmod) {
	 * this.custrepo.save(custmod); return "index"; }
	 * 
	 */
	

	  @RequestMapping("/allcustomer") 
	  public List<Customermodel>
	  getAllCustomermodel(){ return custservice.getAllCustomermodel();
	  
	  }
	  
	  @PostMapping("/insercustomer") 
	  public Customermodel
	  createCustomermodel(@RequestBody Customermodel custmodel) { return
	  custservice.createCustomermodel(custmodel);
	  
	  }
	  
	  @GetMapping("/{id}") 
	  public Customermodel getCustomermodelById(@PathVariable Integer id)
	  { return custservice.getCustomermodelById(id);
	  
	  }
	  
	  
	  @PostMapping("/{id}") public Customermodel updateCustomermodel(@PathVariable Integer id, @RequestBody Customermodel custmodel) 
	  { return
	  custservice.updateCustomermodel(id,custmodel); }
	 
}
