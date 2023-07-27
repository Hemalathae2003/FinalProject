package com.verizon.csp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verizon.csp.model.Catalogmodel;



@Repository
public interface CatalogRepo extends JpaRepository<Catalogmodel, Integer> {

}
