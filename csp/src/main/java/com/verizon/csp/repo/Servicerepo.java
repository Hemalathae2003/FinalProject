package com.verizon.csp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.verizon.csp.model.Servicemodel;

@Repository
public interface Servicerepo extends JpaRepository<Servicemodel, Integer> {

}
