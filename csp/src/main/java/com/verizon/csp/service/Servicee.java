package com.verizon.csp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.verizon.csp.model.Servicemodel;

import com.verizon.csp.repo.Servicerepo;



@Service
public class Servicee {

	private final Servicerepo servrepo;
	
	@Autowired
	public Servicee(Servicerepo servrepo) {
		// TODO Auto-generated constructor stub
		this.servrepo = servrepo;
	}
	
	public List<Servicemodel> getAllServicemodel(){
		return servrepo.findAll();
	}
	
	public Servicemodel createServicemodel(Servicemodel servicemodel) {
		
		return servrepo.save(servicemodel);
		
	}
	
	public Servicemodel getServicemodelById (Integer service_id) {
		return servrepo.findById(service_id).orElse((null));
	}
	
	/*
	 * public Servicemodel updateServicemodel(Integer id,Servicemodel service) {
	 * Servicemodel existingServicemodel =servrepo.findById(id).orElse(null); if
	 * (existingServicemodel !=null) {
	 * existingServicemodel.setCust_name(customer.getCust_name());
	 * existingServicemodel.setCust_age(customer.getCust_age()); return
	 * servrepo.save(existingCustomer);
	 * 
	 * } return null;
	 * 
	 * 
	 * }
	 */
	/*
	 * public void deleteCustomer(Integer id) { custrepo.deleteById(id); }
	 * 
	 */
	
	
}
