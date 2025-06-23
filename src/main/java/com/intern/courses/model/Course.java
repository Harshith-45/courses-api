package com.intern.courses.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    private String name;
    private String description;

    @ManyToMany
    private List<Course> prerequisites;

    // Default constructor
    public Course() {}

    // All-args constructor (excluding id)
    public Course(String code, String name, String description, List<Course> prerequisites) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.prerequisites = prerequisites;
    }

    // Full constructor including id (optional)
    public Course(Long id, String code, String name, String description, List<Course> prerequisites) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.description = description;
        this.prerequisites = prerequisites;
    }

    // Getters
    public Long getId() { return id; }

    public String getCode() { return code; }

    public String getName() { return name; }

    public String getDescription() { return description; }

    public List<Course> getPrerequisites() { return prerequisites; }

    // Setters
    public void setId(Long id) { this.id = id; }

    public void setCode(String code) { this.code = code; }

    public void setName(String name) { this.name = name; }

    public void setDescription(String description) { this.description = description; }

    public void setPrerequisites(List<Course> prerequisites) { this.prerequisites = prerequisites; }
}
