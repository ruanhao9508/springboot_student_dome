package com.qf.springboot_student_dome;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf")
@MapperScan("com.qf.dao")
public class SpringbootStudentDomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStudentDomeApplication.class, args);
    }

}
