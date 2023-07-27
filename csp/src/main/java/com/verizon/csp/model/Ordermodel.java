package com.verizon.csp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Ordermodel {
	
	
	//@ManyToOne // Many orders can be taken for one plan
    //@JoinColumn(name = "plan_id") // Name of the foreign key column in the order table
    private int plan_id;
	
	
	
	@Id
	private int order_id;
	public Ordermodel() {
	}
	public int getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(int plan_id) {
		this.plan_id = plan_id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	

	
}
