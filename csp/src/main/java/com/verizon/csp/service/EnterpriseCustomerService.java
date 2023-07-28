package com.verizon.csp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.csp.model.Customermodel;
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
	
	public EnterpriseCustomermodel getEnterpriseCustomermodelById (Integer ecust_id) {
		return entprisegrepo.findById(ecust_id).orElse((null));
	}
	
	public EnterpriseCustomermodel updateEnterpriseCustomermodel(Integer id,EnterpriseCustomermodel entprisemodel) {
		EnterpriseCustomermodel existingEnterpriseCustomermodel = entprisegrepo.findById(id).orElse(null);
		if (existingEnterpriseCustomermodel != null) {
			existingEnterpriseCustomermodel.setEc_id(entprisemodel.getEc_id());
			existingEnterpriseCustomermodel.setEc_name(entprisemodel.getEc_name());
			existingEnterpriseCustomermodel.setOrdermodel(entprisemodel.getOrdermodel());
		
			return entprisegrepo.save(existingEnterpriseCustomermodel);
			
		}
		return null;
	}
	
}
