package com.springMVC.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;


@Controller
@RequestMapping("/person")
public class PersonController {

	/**
	 * Take care when using @InitBinder
	 * @see <a href="https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-controller/ann-initbinder.html#mvc-ann-initbinder-model-design">InitBinder</a>
	 * @param dataBinder
	 */
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		// regulate which fields can be accessed
		dataBinder.setAllowedFields("firstName", "lastName", "planet", "language", "operatingSystems", "postalCode", "luckyNumber");

		// parameter 'true" defines, that if only white spaces are passed, change value to null
		StringTrimmerEditor editor = new StringTrimmerEditor(true);

		dataBinder.registerCustomEditor(String.class, editor);
	}

	@RequestMapping("/form")
	public String showForm(Model model) {
		
		Person person = new Person();
		
		model.addAttribute("person", person);
		
		return "personForm";
	}
	
	// bindingResult gets passed the errors
	@RequestMapping("processForm")
	public String processForm(@Valid @ModelAttribute("person") Person person,
			BindingResult bindingResult) {

		// if validation fails, reload form with request data
		if(bindingResult.hasErrors()) {
			return "personForm";
		} else {
			return "personConfirmation";
		}
	}
}
