package com.service.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.service.spring.domain.Customer;
import com.service.spring.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/insertCustomer.do")
	public ModelAndView insert(Customer vo) throws Exception{
		customerService.addCustomer(vo);
		return new ModelAndView("insert_result","vo",vo);
	}
	@RequestMapping("/search.do")
	public ModelAndView search(String command,String word) throws Exception{
		List<Customer> list=null;
		String viewname="";
		if(command.equals("findCustomerById")) {
			list=customerService.findCustomerById(word);
			viewname="find_result";
		}
		return new ModelAndView(viewname,"list",list);
	}
	
}
