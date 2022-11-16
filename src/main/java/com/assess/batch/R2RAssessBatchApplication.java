package com.assess.batch;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class R2RAssessBatchApplication {

	private static final Logger logger = LogManager.getLogger(R2RAssessBatchApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(R2RAssessBatchApplication.class, args);
		logger.info("Assess-Batch is Started Succssfully::");
	}

}
