package com.guru.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guru.service.ConsoleLoggerService;

@RestController
public class LoggerController {
	
	@Autowired ConsoleLoggerService consoleLoggerService;
	
	@GetMapping
	public String consolelogger() {
		consoleLoggerService.consolelog();
		return "CONSOLE LOGGER SUCCESS";
	}
}
