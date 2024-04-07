package com.service.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.service.spring.domain.Customer;
@Service
public interface CustomerService {
	void addCustomer(Customer vo) throws Exception;
	List<Customer> findCustomerById(String id) throws Exception;

}
