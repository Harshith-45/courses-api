package com.intern.courses.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseInstance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Link to the main course (e.g., CS101)
    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    // When the course is offered (e.g., Spring 2025)
    private String semester; // e.g., "Spring" or "Fall"
    private int year;

    // Optional: Who teaches the course in this instance
    private String instructor;

    // Additional attributes can be added (room, schedule, capacity, etc.)
}
