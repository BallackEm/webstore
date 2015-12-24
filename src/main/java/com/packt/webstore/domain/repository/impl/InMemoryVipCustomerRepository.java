package com.packt.webstore.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Address;
import com.packt.webstore.domain.VipCustomer;
import com.packt.webstore.domain.repository.VipCustomerRepository;

@Repository
public class InMemoryVipCustomerRepository implements VipCustomerRepository{
	
	private List<VipCustomer> listOfVipCustomers = new ArrayList<VipCustomer>();
	
	public InMemoryVipCustomerRepository() {
		super();
		VipCustomer e = new VipCustomer("CUIBAP", "CUI MIA");
		e.setPhoneNumber("0987 481 122");
		Address billingAddress = new Address();
		billingAddress.setAreaName("Q8");
		billingAddress.setCountry("Viet Nam");
		billingAddress.setDoorNo("113");
		billingAddress.setState("Pleiku");
		billingAddress.setStreetName("Duong Ba Trac");
		billingAddress.setZipCode("084");
		e.setBillingAddress(billingAddress);
		listOfVipCustomers.add(e);
	}

	public void saveCustomer(VipCustomer customer) {
		// TODO Auto-generated method stub
		
	}

	public VipCustomer getCustomer(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean isCustomerExist(String customerId) {
		// TODO Auto-generated method stub
		for (VipCustomer vipCustomer : listOfVipCustomers) {
			if (customerId.equals(vipCustomer.getCustomerId())) {
				return true;
			}
		}
		return false;
	}

}
