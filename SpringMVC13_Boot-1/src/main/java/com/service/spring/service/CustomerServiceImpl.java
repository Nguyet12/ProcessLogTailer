package com.service.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.spring.dao.CustomerDAO;
import com.service.spring.domain.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDAO customerDAO;

	@Override
	public void addCustomer(Customer vo) throws Exception {
		// TODO Auto-generated method stub
		customerDAO.addCustomer(vo);
	}

	@Override
	public List<Customer> findCustomerById(String id) throws Exception {
		// TODO Auto-generated method stub
		return customerDAO.findCustomerById(id);
	}

}
