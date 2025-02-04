package com.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.beans.MyUser;

@Controller
public class MyUserController {
	
	@GetMapping("/register")
	public String displayform(Model m) {
		MyUser myUser=new MyUser();
		List<String> professionList=Arrays.asList("Developer","Designer","tester");
		m.addAttribute("professionList", professionList);
		m.addAttribute("myUser", myUser);
		return "registrationform";
	}
	
	@PostMapping("/register")
	public String submitform(@Valid @ModelAttribute("myUser") MyUser myUser,BindingResult bindingResult,Model m) {
		System.out.println("in submit form");
		System.out.println(myUser);
		if(bindingResult.hasErrors()) {
			List<String> professionList=Arrays.asList("Developer","Designer","tester");
			m.addAttribute("professionList", professionList);
			return "registrationform";
		}
		
		return "success";
	}
	

}
