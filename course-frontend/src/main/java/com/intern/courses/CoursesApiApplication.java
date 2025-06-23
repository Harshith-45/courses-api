package com.intern.courses;

import com.intern.courses.model.Course;
import com.intern.courses.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class CoursesApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoursesApiApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(CourseRepository repo) {
        return args -> {
            Course course = new Course("CS101", "Intro to Programming", "Learn basics of programming", new ArrayList<>());
            repo.save(course);
        };
    }
}
