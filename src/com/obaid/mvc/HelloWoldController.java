package com.obaid.mvc;



import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//to add relative path
@RequestMapping("hello")
public class HelloWoldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		
		return "helloworld";
	}
	@RequestMapping("/processForm2")
	public String letsShout(HttpServletRequest request, Model model) {
		
		String studentName=request.getParameter("studentName");
		
		studentName= "YO!! "+studentName.toUpperCase();
		
		model.addAttribute("message",studentName);		
		return "helloworld";
	}
	
	//using Annotations instead of request
	@RequestMapping("/processForm3")
	public String processFormVersion3(@RequestParam("studentName") String studentName, Model model) {
		
		System.out.println("version 3");
		
		studentName= "YO!! "+studentName.toUpperCase()+ " version 3";
		
		model.addAttribute("message",studentName);		
		return "helloworld";
	}
}
