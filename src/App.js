import './App.css';
import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Navbar from './components/Navbar';
import CourseList from './pages/CourseList';
import AddCoursePage from './pages/AddCoursePage';

function App() {
  return (
    <Router>
      <Navbar />
      <div className="container mt-4">
        <Routes>
          <Route path="/add" element={<AddCoursePage />} />
          <Route path="/" element={<CourseList />} />
        </Routes>
      </div>
    </Router>
  );
}

export default App;
