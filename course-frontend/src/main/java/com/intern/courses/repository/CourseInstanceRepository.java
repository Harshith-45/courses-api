package com.intern.courses.repository;

import com.intern.courses.model.CourseInstance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseInstanceRepository extends JpaRepository<CourseInstance, Long> {
    // You can add custom queries if needed, e.g.:
    // List<CourseInstance> findByCourseCode(String code);
}
