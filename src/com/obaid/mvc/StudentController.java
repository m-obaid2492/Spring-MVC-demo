package com.obaid.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Value("#{countryOptions}")
	private Map<String, String> countryOptions;
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		Student newStudent= new Student();
		
		model.addAttribute("student", newStudent);
		//fetch data from the properties file
		model.addAttribute("newcountryOptions", countryOptions) ;
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student newStudent) {
		
		System.out.println("student:"+newStudent.toString());
		
		
		
		return "student-confirmation";
		
	}
}
