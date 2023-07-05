package com.springMVC.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/v02")
public class HomeControllerV02 {

	@RequestMapping("/form")
	public String secondForm() {
		return "secondForm";
	}

	// Parameter binding
	@RequestMapping("/processForm")
	public String processForm02(
			@RequestParam("personName") String personName, 
			Model model) {

		// read request data
		String lowerCaseName = personName.toLowerCase();
		// add data to the model -> gets passed as argument
		model.addAttribute("name", lowerCaseName);

		return "helloStranger";
	}
}
