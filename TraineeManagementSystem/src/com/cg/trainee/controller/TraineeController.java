package com.cg.trainee.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.trainee.model.Trainee;
import com.cg.trainee.service.ITraineeService;

@Controller
@RequestMapping("/trainee")
public class TraineeController {

	@Autowired
	ITraineeService service;
	
	HttpSession session;
	@RequestMapping("/choice")
	public String goToStart(HttpServletRequest request, Model model){
		
		session = request.getSession(true);
		if(session.getAttribute("username")!=null && session.getAttribute("password")!=null){
			return "options";
		}
		else{
			
			return "redirect:../index2.obj";
		}
	}
	
	@RequestMapping("/add")
	public String goToForm(Model model){
		model.addAttribute("id", new String());
		model.addAttribute("trainee", new Trainee());
		return "traineeRegForm";
	}
	
	@RequestMapping("/reg")
	public String registration(@ModelAttribute("trainee") @Valid Trainee trainee,BindingResult result, Model model){
		
		if(result.hasErrors())
		{
			return "traineeRegForm";
		}
		else{
			try{
				service.addDetails(trainee);
				model.addAttribute("k", trainee);
				return "traineeSuccess";
			}
			catch(Exception e){
				model.addAttribute("id", "*already present in database");
			}
			
			return "traineeRegForm";
		}
	}
	
	
	@RequestMapping("/goDelete")
	public ModelAndView goToDelete(Model model){
		
		List<Integer> idList= service.retrieveIds();
		return new ModelAndView("traineeIdDelete", "idList", idList);
	}
	
	@RequestMapping("/delete")
	public String deleteById(@RequestParam("traineeId") int traineeId, Model model){
		
		service.deleteTrainee(traineeId);
		model.addAttribute("traineeId", traineeId);
		return "deleteTrainee";
	}
	
	
	@RequestMapping("/goFindAll")
	public ModelAndView findAll(){
		
		List<Trainee> custList = service.retrieveDetails();
		return new ModelAndView("TraineesListSuccess", "list", custList);
	}
	
	
	@RequestMapping("/logout")
	public String logoutAction(HttpServletRequest req,Model m){
		System.out.println("in logout ");
			session = req.getSession(false);
			session.invalidate();
			
		return "redirect:../index.obj";
	}
}
