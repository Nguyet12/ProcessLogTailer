package com.service.spring.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.service.spring.domain.Customer;
@Repository
public class CustomerDAOImpl implements CustomerDAO {
	@Autowired
	private SqlSession sqlSession;

	private static final String NS="CustomerMapper.";
	@Override
	public void addCustomer(Customer vo) throws Exception {
		// TODO Auto-generated method stub
		 sqlSession.insert(NS+"addCustomer",vo);
	}

	@Override
	public List<Customer> findCustomerById(String id) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(NS+"findCustomerById",id);
	}

}
