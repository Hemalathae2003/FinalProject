package com.verizon.csp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verizon.csp.model.Customermodel;

@Repository
public interface Customerrepo extends JpaRepository<Customermodel, Integer>{

}

