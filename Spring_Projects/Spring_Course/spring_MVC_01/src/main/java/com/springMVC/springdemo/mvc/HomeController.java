package com.springMVC.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/v01")
public class HomeController {

	@RequestMapping("/")
	public String showPage() {
		return "index";
	}
	
	@RequestMapping("/form")
	public String firstForm() {
		return "firstForm";
	}

	
	@RequestMapping("/processForm")
	public String processForm(HttpServletRequest request, Model model) {
		// read request data
		String upperCaseName = request.getParameter("personName").toUpperCase();
		// add data to the model -> gets passed as argument
		model.addAttribute("name", upperCaseName);

		return "helloStranger";
	}

}
