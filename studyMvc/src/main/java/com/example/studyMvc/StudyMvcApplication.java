package com.example.studyMvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class StudyMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyMvcApplication.class, args);
	}

}
