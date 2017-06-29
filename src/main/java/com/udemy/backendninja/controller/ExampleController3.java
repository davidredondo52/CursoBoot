package com.udemy.backendninja.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.udemy.backendninja.model.Person;

@Controller
@RequestMapping("/example3")
public class ExampleController3 {

	private static final String FORM_VIEW="form";
	private static final String RESULT_VIEW="result";
	
	private static Log logger=LogFactory.getLog(ExampleController3.class);
	@GetMapping("/showform")
	public String showForm(Model model)
	{
		logger.warn("WARN");
		logger.error("error");
		logger.info("info");
		//int num=6/0;
		model.addAttribute("model", model);
		model.addAttribute("person", new Person());
		return FORM_VIEW;
	}
	
	@PostMapping("/addperson")
	public ModelAndView addPerson(@ModelAttribute("person")Person person )
	{
		logger.info("person=>"+person);
		ModelAndView model=new ModelAndView(RESULT_VIEW);
		model.addObject("person", person);
		return model;
	}
	
	/*@GetMapping("/")
	public String redirect()
	{
		
		return "redirect:/example3/showform";
	}*/
	@GetMapping("/")
	public RedirectView redirect()
	{
		return new RedirectView("/example3/showform");
	}
}
