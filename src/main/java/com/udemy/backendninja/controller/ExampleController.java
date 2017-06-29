package com.udemy.backendninja.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.backendninja.model.Person;

@Controller
@RequestMapping("/example")
public class ExampleController {

	private static final String EXAMPLE_VIEW = "example";

	@GetMapping("/exampleString")
	// @RequestMapping(value="/exampleString", method=RequestMethod.GET)
	public String exampleString(Model model) {
		model.addAttribute("person", new Person("Jhon", 23));
		return EXAMPLE_VIEW;
	}

	// @RequestMapping(value="/exampleMAV",method=RequestMethod.GET)
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAC() {

		ModelAndView m = new ModelAndView(EXAMPLE_VIEW);
		m.addObject("people", this.getPeople());
		return m;
	}

	private List<Person> getPeople() {
		List<Person> personas = new ArrayList<>();
		personas.add(new Person("Juan", 20));
		personas.add(new Person("Ramón", 12));
		personas.add(new Person("Lucia", 30));
		personas.add(new Person("Pepe", 27));
		personas.add(new Person("Iñigo", 44));
		personas.add(new Person("Raul", 33));
		personas.add(new Person("Perico", 22));
		return personas;
	}
}
