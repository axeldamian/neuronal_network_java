package com.leibnix.leibnix;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeibnixApplication {

	private static final Logger log = LogManager.getLogger(LeibnixApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LeibnixApplication.class, args);
		log.info("application initialized");
	}

}
