package com.app.sancus.test.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class TestRunner implements CommandLineRunner {

	private static Logger log=LoggerFactory.getLogger(TestRunner.class);
	@Override
	public void run(String... args) throws Exception {
		try {
			log.info("STARTED");
		} catch (Exception e) {
		e.printStackTrace();
		}
		int a=10;
		System.out.println("WELCOME TO TEST APP "+a);
		log.info("END");
	}

}
