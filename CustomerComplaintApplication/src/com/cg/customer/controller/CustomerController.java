package com.cg.customer.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.customer.model.Customer;
import com.cg.customer.service.ICustomerService;

@Controller
public class CustomerController {

	@Autowired
	ICustomerService service;
	
	
	@RequestMapping("/index")
	public String start(Model model){
		model.addAttribute("customer", new Customer());
		return "CustomerComplaintForm";
	}
	
	@RequestMapping("/registration")
	public String registration(@ModelAttribute("customer") @Valid Customer customer, BindingResult result, Model model){
		
		if(result.hasErrors())
		{
			return "CustomerComplaintForm";
		}
		else{
			
			service.moreInfo(customer);
		
			Customer cust = service.addDetails(customer);
			model.addAttribute("k", cust);
			return "CustomerSuccess";
		}
	}
	
	@RequestMapping("/status")
	public String goTostatus(){
		return "CheckStatus";
	}
	
	@RequestMapping("/getStatus")
	public String statusDetails(@RequestParam("complaintId") int complaintId, Model model){

		Customer customer = service.getDetails(complaintId);
		
		model.addAttribute("customer", customer);
		return "CheckStatus";
	}
	
}
