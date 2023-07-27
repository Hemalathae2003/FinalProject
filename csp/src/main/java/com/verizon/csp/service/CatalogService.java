package com.verizon.csp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.csp.model.Catalogmodel;
import com.verizon.csp.repo.CatalogRepo;





@Service
public class CatalogService {

	private final CatalogRepo catalogrepo;
	
	
	@Autowired
	public CatalogService(CatalogRepo catalogrepo) {

		this.catalogrepo = catalogrepo;
	}
	
		
	public List<Catalogmodel> getAllCatalogmodel(){
		return catalogrepo.findAll();
	}
	
	public Catalogmodel createCatalogmodel(Catalogmodel catmodel) {
		return catalogrepo.save(catmodel);
	}
	


	
}
