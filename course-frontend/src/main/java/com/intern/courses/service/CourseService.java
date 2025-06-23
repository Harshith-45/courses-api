package com.intern.courses.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.intern.courses.model.Course;
import com.intern.courses.repository.CourseRepository;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course createCourse(Course course) {
        List<Course> validatedPrereqs = new ArrayList<>();
        for (Course prereq : course.getPrerequisites()) {
            Course existing = courseRepository.findById(prereq.getId())
                .orElseThrow(() -> new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Invalid prerequisite course ID: " + prereq.getId()
                ));
            validatedPrereqs.add(existing);
        }

        course.setPrerequisites(validatedPrereqs);
        return courseRepository.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course getCourse(Long id) {
        return courseRepository.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Course not found"));
    }

    public void deleteCourse(Long id) {
        Course toDelete = getCourse(id);

        boolean isPrereq = courseRepository.findAll().stream()
            .anyMatch(c -> c.getPrerequisites().contains(toDelete));

        if (isPrereq) {
            throw new ResponseStatusException(
                HttpStatus.CONFLICT,
                "Cannot delete course: it is a prerequisite for another course."
            );
        }

        courseRepository.delete(toDelete);
    }
}
