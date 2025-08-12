package com.shre.spring_data_jpa;

import com.shre.spring_data_jpa.model.Student;
import com.shre.spring_data_jpa.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

        StudentRepository studentRepository = context.getBean(StudentRepository.class);

        Student s1 = context.getBean(Student.class);
        Student s2 = context.getBean(Student.class);
        Student s3 = context.getBean(Student.class);

        s1.setRollNo(101);
        s1.setName("Navin");
        s1.setMarks(75);

        s2.setRollNo(102);
        s2.setName("Kiran");
        s2.setMarks(75);

        s3.setRollNo(103);
        s3.setName("Harsh");
        s3.setMarks(75);

        studentRepository.save(s1);
        studentRepository.save(s2);
        studentRepository.save(s3);
    }
}
