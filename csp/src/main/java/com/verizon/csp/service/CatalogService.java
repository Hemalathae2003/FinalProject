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
	
	public Catalogmodel getCatalogmodelById (Integer plan_id) {
		return catalogrepo.findById(plan_id).orElse((null));
	}
	
	
	public Catalogmodel updateCatalogmodel(Integer id,Catalogmodel catmodel) {
		Catalogmodel existingCatalogmodel = catalogrepo.findById(id).orElse(null);
		if (existingCatalogmodel != null) {
			existingCatalogmodel.setPlan_id(catmodel.getPlan_id());
			existingCatalogmodel.setPlan_name(catmodel.getPlan_name());
			existingCatalogmodel.setDuration(catmodel.getDuration());
			existingCatalogmodel.setPrice(catmodel.getPrice());
			return catalogrepo.save(existingCatalogmodel);
			
		}
		return null;
	}
	
	public void deleteCatalogmodel(Integer id)
	{
		catalogrepo.deleteById(id);
	}
	


	
}
