package com.cg.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class EmpController {
	
	/*@Autowired
	public IEmpService empService;*/
	
	@RequestMapping("/index")
	public String StartHome(){
		return "index";
	}
	
	/*@RequestMapping("/start")
	public String Start(Model m){
		m.addAttribute("beanObj",new DetailsBean());
		return "regForm";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView registerFormSubmission(@Valid @ModelAttribute("beanObj") DetailsBean cust,BindingResult br){
		System.out.println("in reg");
		if(br.hasErrors())
		{
			return new ModelAndView("empForm");
		}
		empService.addDetails(cust);
		return new ModelAndView("success","k",cust);
	}
	
	@RequestMapping(value="/displayAll")
	public ModelAndView DisplayAll(){
	
		List<DetailsBean> beanList=empService.displayAll();
		return new ModelAndView("displayAllDetails","list",beanList);
	}
	*/

}
