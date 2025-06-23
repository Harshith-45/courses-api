# 🎓 Courses API – Full Stack Web Application

A colorful and intuitive full-stack Course Management Portal built using **Spring Boot**, **ReactJS**, and **Docker**, designed as part of the IIT Bombay Internship Assignment.

---

## 📦 Tech Stack

| Layer       | Technology           |
|-------------|----------------------|
| Frontend    | ReactJS, Bootstrap   |
| Backend     | Spring Boot, Java 21 |
| Database    | H2 (In-Memory DB)    |
| DevOps      | Docker, GitHub Actions |
| Hosting     | Docker Hub           |

---

## 🧩 Features

- Create, list, and manage **Courses**.
- Manage **Course Instances** (semester-wise offerings).
- Add **prerequisites** for courses with validation.
- Clean and responsive UI.
- RESTful APIs.
- **Dockerized full-stack** for easy deployment.

---

## 🚀 Getting Started

### 🔧 Backend (Spring Boot)

```bash
# Navigate to backend folder
cd courses-api

# Build the project
mvn clean install

# Run the app
mvn spring-boot:run

Visit: http://localhost:8080

Sample endpoint: GET /courses

🎨 Frontend (ReactJS)
bash
Copy
Edit
# Navigate to frontend folder
cd course-frontend

# Install dependencies
npm install

# Run the development server
npm start
Visit: http://localhost:3000

🐳 Docker Setup
🏗️ Build and Run Locally
bash
Copy
Edit
docker build -t hemaharshith/courses-api .
docker run -p 8080:8080 hemaharshith/courses-api
📤 DockerHub Deployment
Automatically builds and pushes to DockerHub via GitHub Actions.

🛠️ Project Structure
css
Copy
Edit
courses-api/
├── src/
│   ├── main/java/com/intern/courses/
│   └── resources/
├── course-frontend/
│   ├── src/
│   └── public/
├── Dockerfile
├── docker.yml (GitHub Actions)
├── pom.xml
└── README.md


📌 GitHub Repo
🔗 https://github.com/Harshith-45/courses-api

👤 Author
Harshith Reddy
GitHub | DockerHub
