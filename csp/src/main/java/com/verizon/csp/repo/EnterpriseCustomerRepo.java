package com.verizon.csp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.verizon.csp.model.EnterpriseCustomermodel;

@Repository
public interface EnterpriseCustomerRepo extends JpaRepository<EnterpriseCustomermodel, Integer> {

}
