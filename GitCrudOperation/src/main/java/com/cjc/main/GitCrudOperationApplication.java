package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitCrudOperationApplication {

	public static void main(String[] args) {
		System.out.println("This is crud Operation");
		SpringApplication.run(GitCrudOperationApplication.class, args);
	}

}
