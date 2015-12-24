package com.packt.webstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packt.webstore.domain.VipCustomer;
import com.packt.webstore.domain.repository.VipCustomerRepository;
import com.packt.webstore.service.VipCustomerService;

@Service
public class VipCustomerServiceImpl implements VipCustomerService{

	@Autowired
	private VipCustomerRepository vipCustomerRepository;
	
	public void saveCustomer(VipCustomer customer) {
		// TODO Auto-generated method stub
		
	}

	public VipCustomer getCustomer(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean isCustomerExist(String customerId) {
		// TODO Auto-generated method stub
		return vipCustomerRepository.isCustomerExist(customerId);
	}

}
