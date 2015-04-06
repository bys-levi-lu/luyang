package com.ly.web.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class LoginAction
{
	@RequestMapping("/forward")
	public String forwarLogin()
	{
		System.out.println("==========ccccccccccccccccccccUser Name:");
		return "/login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String forwarLogin(
			@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password)
	{
		System.out.println("=============User Name:" + username);
		System.out.println("=============Password:" + password);
		return "/welcome";
	}

}
