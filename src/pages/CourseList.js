import React, { useEffect, useState } from 'react';
import axios from 'axios';

export default function CourseList() {
  const [courses, setCourses] = useState([]);

  useEffect(() => {
    axios.get('http://localhost:8080/api/courses')
      .then(response => {
        setCourses(response.data);
      })
      .catch(error => {
        console.error("Error fetching courses:", error);
      });
  }, []);

  return (
    <div className="container mt-4">
      <h2>Available Courses</h2>
      <ul className="list-group">
        {courses.map(course => (
          <li key={course.id} className="list-group-item">
            <h5>{course.name} ({course.code})</h5>
            <p>{course.description}</p>
            {course.prerequisites?.length > 0 && (
              <small>Prerequisites: {course.prerequisites.join(', ')}</small>
            )}
          </li>
        ))}
      </ul>
    </div>
  );
}
