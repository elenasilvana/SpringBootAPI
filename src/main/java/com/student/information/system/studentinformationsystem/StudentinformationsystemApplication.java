package com.student.information.system.studentinformationsystem;

import com.student.information.system.studentinformationsystem.repository.StudentRepository;
import com.student.information.system.studentinformationsystem.service.StudentService;
import com.student.information.system.studentinformationsystem.service.impl.StudentServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class StudentinformationsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentinformationsystemApplication.class, args);
	}

}
