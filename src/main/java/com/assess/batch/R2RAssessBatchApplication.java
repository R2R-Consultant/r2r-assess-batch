package com.assess.batch;


import org.apache.logging.log4j.LogManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class R2RAssessBatchApplication {

	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(R2RAssessBatchApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(R2RAssessBatchApplication.class, args);
		logger.info("Assess-Batch is Started Succssfully::");
	}

}
