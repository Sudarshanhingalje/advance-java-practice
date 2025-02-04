package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@GetMapping("/mylogin")
	public String showloginform() {
		return "loginpage";
	}
	
	@PostMapping("/validateuser")
	public String validateuser(@RequestParam("uname") String uname,@RequestParam("pass") String p1){
		if(uname.equals("admin") && p1.equals("admin")) {
			return "success";
		}else {
			return "failure";
		}
	} 
}
