package com.example.ajax;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.example.*"})
public class AjaxDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AjaxDemoApplication.class, args);
	}

}
