package com.udemy.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example2")
public class ExampleController2 {

	private static final String EXAMPLE_VIEW="example2";
	
	@GetMapping("/request1")
	public ModelAndView request1(@RequestParam(name="nm",required=false,defaultValue="NULO") String name)
	{
		ModelAndView m=new ModelAndView(EXAMPLE_VIEW);
		m.addObject("nm_in_model",name);
		return m;
	}
	
	@GetMapping("/request2/{nm}")
	public ModelAndView request2(@PathVariable("nm") String name)
	{
		ModelAndView m=new ModelAndView(EXAMPLE_VIEW);
		m.addObject("nm_in_model",name);
		return m;
	}
}
