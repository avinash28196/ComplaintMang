package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.model.CustomerBean;
@RequestMapping(value="customer")
@Controller
public class CustController {

	@RequestMapping(value="reg")
	public String getRegister(Model model){
		
		System.out.println("hi");
		model.addAttribute("bean",new CustomerBean());
		return "register";
	}
	
	@RequestMapping(value="getRegDetails")
		public String myRequest(@RequestParam("customerName") String customerName,
								@RequestParam("email") String email,
								@RequestParam("mobNo") String mobNo,
								@RequestParam("dob") String dob,
								Model model)
	{
		model.addAttribute("customerName", customerName);
		model.addAttribute("email", email);
		model.addAttribute("mobNo", mobNo);
		model.addAttribute("dob", dob);
		
		return "show";
	}
}
