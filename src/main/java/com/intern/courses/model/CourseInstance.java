package com.intern.courses.model;

import jakarta.persistence.*;

@Entity
public class CourseInstance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    private String semester;

    @Column(name = "academic_year")
    private int academicYear;

    private String instructor;

    public CourseInstance() {}

    public CourseInstance(Long id, Course course, String semester, int academicYear, String instructor) {
        this.id = id;
        this.course = course;
        this.semester = semester;
        this.academicYear = academicYear;
        this.instructor = instructor;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public Course getCourse() {
        return course;
    }

    public String getSemester() {
        return semester;
    }

    public int getAcademicYear() {
        return academicYear;
    }

    public String getInstructor() {
        return instructor;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setAcademicYear(int academicYear) {
        this.academicYear = academicYear;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
}
