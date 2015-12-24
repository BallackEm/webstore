package com.packt.webstore.service;

import com.packt.webstore.domain.VipCustomer;

public interface VipCustomerService {
	public void saveCustomer(VipCustomer customer);
	public VipCustomer getCustomer(String customerId);
	public Boolean isCustomerExist(String customerId);
}
