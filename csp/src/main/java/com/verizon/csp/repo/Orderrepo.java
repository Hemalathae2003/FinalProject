package com.verizon.csp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.verizon.csp.model.Ordermodel;

@Repository
public interface Orderrepo extends JpaRepository<Ordermodel, Integer>{

}
