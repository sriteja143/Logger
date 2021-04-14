package com.guru.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;   
import org.springframework.stereotype.Service;


@Service
public class ConsoleLoggerService { 
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public void consolelog() {
		logger.info("From ConsoleLoggerService");
		logger.debug("From ConsoleLoggerService");
		logger.warn("From ConsoleLoggerService");
		logger.error("From ConsoleLoggerService");
		logger.error("From ConsoleLoggerService");
	}
}
// commited