package com.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/content")
public class TestController {

	@RequestMapping(value = "/welcome")
	public String msg() {
		String str = LocalDateTime.now()
				.format(DateTimeFormatter.ofPattern("EEEE, dd-MMMM,yyyy HH:mm:ss:SSS a"));
		System.out.println("hello world.");
		return "hello world :: " + str;
	}

}
