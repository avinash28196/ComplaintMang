package com.cg.complaint.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.complaint.model.ComplaintDetails;
import com.cg.complaint.service.IComplaintService;



@Controller
public class ComplaintController {

	@Autowired
	IComplaintService service;
	
	
	@RequestMapping("/index")
	public ModelAndView findForm(Model m)
	{
		List<String> li=service.getAllPrior();
		m.addAttribute("complaint",new ComplaintDetails());
		return new ModelAndView("ComplaintRegForm","key1",li);
		
	}
/*	
	@RequestMapping("/index")
	public ModelAndView gotToComplaintPage()
	{
		List<String> li=service.getAllPrior();
		System.out.println(li);
		//.addAttribute("key",li);
		return new ModelAndView("ComplaintRegForm","complaint",new ComplaintDetails());
		
	}
*/
	
	@RequestMapping(value="/submit",method=RequestMethod.POST)
	public ModelAndView addComplaint(@ModelAttribute("complaint") @Valid ComplaintDetails complaint,BindingResult result)
	{
		if(result.hasErrors())
		{
			return new ModelAndView("ComplaintRegForm");
		}
		else
		{
		service.addComplaint(complaint);
		return new ModelAndView("SuccessPage","complaint",complaint);
		}
	}
	
	
	@RequestMapping(value="/checkStatus")
	public ModelAndView getById()
	{
		
		return new ModelAndView("CheckStatus");
	}
	
	
	@RequestMapping(value="/findById")
	public ModelAndView getStatusById(@RequestParam("complaintId") int Id)
	{
		
		ComplaintDetails c=service.getStatusById(Id);
		return new ModelAndView("found","compl",c);
	}
	
	
	
	
}
