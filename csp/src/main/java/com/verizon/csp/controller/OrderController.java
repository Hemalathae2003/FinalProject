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

import com.verizon.csp.model.EnterpriseCustomermodel;
import com.verizon.csp.model.Ordermodel;
import com.verizon.csp.repo.Orderrepo;
import com.verizon.csp.service.OrderService;

/*@Controller
@RequestMapping(value="/api/order",method= {RequestMethod.GET,RequestMethod.POST})*/
@RestController
@RequestMapping("/api/order")

public class OrderController {
	
	//private Orderrepo orderrepo;
	private OrderService orderservice;
	
	@Autowired
	public OrderController(OrderService orderservice) {
		
		this.orderservice = orderservice;
	}
	
	/*
	 * @GetMapping("/create") public String create(Orderrepo orderrepo) { return
	 * "Order.html" ; }
	 * 
	 * @PostMapping("/submit-order") public String save(Ordermodel odmod) {
	 * this.orderrepo.save(odmod); return "index" ; }
	 */
	
	
	  @RequestMapping("/allorder") public List<Ordermodel> getAllOrdermodel(){
	  return orderservice.getAllOrdermodel();
	  
	  }
	  
	  @PostMapping("/inserorder") public Ordermodel createOrdermodel(@RequestBody
	  Ordermodel ordermodel) { return orderservice.createOrdermodel(ordermodel);
	  
	  }
	  
	  @GetMapping("/{id}") public Ordermodel getOrdermodelById(@PathVariable
	  Integer id) { return orderservice.getOrdermodelById(id);
	  
	  }
	  
	  
	  @PostMapping("/{id}") public Ordermodel updateOrdermodel(@PathVariable
	  Integer id, @RequestBody Ordermodel ordermodel) { return
	  orderservice.updateOrdermodel(id,ordermodel); }
	  
	 
}
