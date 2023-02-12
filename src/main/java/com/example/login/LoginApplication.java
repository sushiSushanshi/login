package com.example.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.login.dao.StudentRepo;
import com.example.login.model.Student;

@SpringBootApplication
public class LoginApplication {
	
	
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LoginApplication.class, args);
		
		StudentRepo studentRepo = context.getBean(StudentRepo.class);
		
		Student student1 = new Student("sushi1","sushi1234","sushi1234@gmail.com");
		
		studentRepo.save(student1);
	}

}
