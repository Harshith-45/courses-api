import React from 'react';
import { Link } from 'react-router-dom';

export default function Navbar() {
  return (
    <nav className="navbar navbar-expand-lg navbar-dark bg-primary px-3">
      <Link className="navbar-brand" to="/">Course Portal</Link>
      <div className="ml-auto">
        <Link className="nav-link text-light" to="/add">Add Course</Link>
      </div>
    </nav>
  );
}
