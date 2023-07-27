package com.verizon.csp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.csp.model.EnterpriseCustomermodel;
import com.verizon.csp.repo.EnterpriseCustomerRepo;

@Service
public class EnterpriseCustomerService {

	private final EnterpriseCustomerRepo entprisegrepo;
	
	@Autowired
	public EnterpriseCustomerService(EnterpriseCustomerRepo entprisegrepo) {

		this.entprisegrepo = entprisegrepo;
	}
	
		
	public List<EnterpriseCustomermodel> getAllEnterpriseCustomermodel(){
		return entprisegrepo.findAll();
	}
	
	public EnterpriseCustomermodel createEnterpriseCustomermodel(EnterpriseCustomermodel entprisemodel) {
		return entprisegrepo.save(entprisemodel);
	}
	
}
