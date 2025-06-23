package com.intern.courses.repository;

import com.intern.courses.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course, Long> {
    Optional<Course> findByCode(String code); // ✅ Valid field in Course
}
