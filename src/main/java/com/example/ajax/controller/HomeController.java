package com.example.ajax.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	protected String home()
	{
		String returnUrl = "jsp/home";
                
		return returnUrl;
	}
	@RequestMapping(value = "/save")
	protected String save()
	{
		String returnUrl = "jsp/save";
                
		return returnUrl;
	}
}
