package com.verizon.csp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.verizon.csp.model.Ordermodel;
import com.verizon.csp.repo.Orderrepo;

@Service
public class OrderService {

	private final Orderrepo orderrepo;
	
	@Autowired
	public OrderService(Orderrepo orderrepo) {

		this.orderrepo = orderrepo;
	}
	
	public List<Ordermodel> getAllOrdermodel(){
		return orderrepo.findAll();
	}
	
	public Ordermodel createOrdermodel(Ordermodel ordermodel) {
		return orderrepo.save(ordermodel);
	}
	

}
