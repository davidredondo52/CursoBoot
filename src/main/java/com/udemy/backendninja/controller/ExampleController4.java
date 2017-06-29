package com.udemy.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@RequestMapping("/example4")
@Controller
public class ExampleController4 {

	private static final String VISTA="404";
	private static final String VISTA2="500";
	
	@GetMapping("/404")
	public String  getNotFound()
	{
		return VISTA;
	}
	
	@GetMapping("/")
	public RedirectView  redirect()
	{
		return new RedirectView("/example4/404");
	}
	
	@GetMapping("/500")
	public String  get500()
	{
		return VISTA2;
	}
}
