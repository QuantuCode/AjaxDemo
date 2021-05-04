package com.example.ajax.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ajax.student.Student;


@RestController
public class StudentController {
	private static final Logger LOGGER = LogManager.getLogger(StudentController.class);
	@ResponseBody
	@RequestMapping(value ="jsp/home/save",	method = RequestMethod.POST,
					 
					consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_FORM_URLENCODED_VALUE},
							produces = { MediaType.APPLICATION_JSON_VALUE, "application/json" }
	)
	public String save(@RequestBody Student student)
	{
	 String	response = "{\"message\":\"success\"}";
	// LOGGER.info("StudentController->>> save-->" + new Student().getId());
	 System.out.println("StudentController->>> save-->" + new Student().getId());
	 return response;
	}
}
