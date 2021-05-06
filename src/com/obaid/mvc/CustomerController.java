package com.obaid.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		Customer newCustomer= new Customer();
		
		model.addAttribute("customer", newCustomer);
		//fetch data from the properties file
		
		return "customer-form";
	}
	

	//with validations
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer newCustomer,
			BindingResult bindingResult) {
		
		System.out.println("Customer:"+newCustomer.toString());
		
		if (bindingResult.hasErrors()) {
			return "customer-form";
		} else {
			return "customer-confirmation";
		}
		
}
}
