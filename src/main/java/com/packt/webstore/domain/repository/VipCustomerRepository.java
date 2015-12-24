package com.packt.webstore.domain.repository;

import com.packt.webstore.domain.VipCustomer;

public interface VipCustomerRepository {
	
	public void saveCustomer(VipCustomer customer);
	
	public VipCustomer getCustomer(String customerId);
	
	public Boolean isCustomerExist(String customerId);
}
