package com.packt.webstore.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {

	public List<Customer> getAllCustomers() {
		List<Customer> customers = new ArrayList<Customer>();
		Customer e = new Customer();
		e.setName("Ballack");
		e.setAddress("Munich");
		e.setCustomerId("13");
		e.setNoOfOrdersMade(13);
		customers.add(e);
		// TODO Auto-generated method stub
		return customers;
	}

}
