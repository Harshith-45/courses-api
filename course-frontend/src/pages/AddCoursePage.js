import React, { useState } from 'react';
import axios from 'axios';

export default function AddCoursePage() {
  const [course, setCourse] = useState({ code: '', name: '', description: '' });

  const handleChange = (e) => {
    setCourse({ ...course, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    axios.post('http://localhost:8080/api/courses', course)
      .then(response => {
        alert('Course added successfully!');
        setCourse({ code: '', name: '', description: '' });
      })
      .catch(error => {
        console.error("Error adding course:", error);
      });
  };

  return (
    <div className="container mt-4">
      <h2>Add New Course</h2>
      <form onSubmit={handleSubmit}>
        <div className="mb-3">
          <label className="form-label">Code</label>
          <input type="text" className="form-control" name="code" value={course.code} onChange={handleChange} />
        </div>
        <div className="mb-3">
          <label className="form-label">Name</label>
          <input type="text" className="form-control" name="name" value={course.name} onChange={handleChange} />
        </div>
        <div className="mb-3">
          <label className="form-label">Description</label>
          <textarea className="form-control" name="description" value={course.description} onChange={handleChange} />
        </div>
        <button type="submit" className="btn btn-success">Add Course</button>
      </form>
    </div>
  );
}
