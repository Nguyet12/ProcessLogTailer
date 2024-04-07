package com.service.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.service.spring.domain.Customer;
@Repository
public interface CustomerDAO {
    void addCustomer(Customer vo) throws Exception;
	List<Customer> findCustomerById(String id) throws Exception;

}
