package com.cg.trainee.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.trainee.model.Login;
import com.cg.trainee.service.ITraineeService;

@Controller
public class LoginController {

	
	@Autowired
	ITraineeService service;
	
	@RequestMapping("/index")
	public String goToIndex(Model model){
		
		model.addAttribute("user", new String());
		model.addAttribute("pass", new String());
		model.addAttribute("message", new String());
		
		return "loginDetails";
	}
	
	@RequestMapping("/index2")
	public String againToIndex(Model model){
		
		model.addAttribute("user", new String());
		model.addAttribute("pass", new String());
		model.addAttribute("message", "Login Details should be entered first");
		return "loginDetails";
	}
	
	@RequestMapping("/checkLogin")
	public String check(@RequestParam("username") String username, @RequestParam("password") String password,Model model,HttpServletRequest request){

		try{
	
			Login log = service.getLoginDetails(username, password);
				
				HttpSession session = request.getSession(true);
				session.setAttribute("valid",true);
				session.setAttribute("loginDetails", log);
				session.setAttribute("username", username);
				session.setAttribute("password", password);
				
				return "redirect:trainee/choice.obj";
		}
		catch(Exception e){
			model.addAttribute("user", "*Invalid Username");
			model.addAttribute("pass", "*Invalid Password");
			model.addAttribute("msg",new String());
			
		}
		
		return "loginDetails";
	}

}
