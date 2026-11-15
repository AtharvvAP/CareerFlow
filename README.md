# CareerFlow

A job application tracker to manage applications, follow-ups and interviews in one place.

## Features
- Add, edit, delete and search job applications, with status filters
- Dashboard counts for total applications, interviews and offers
- Action Center showing overdue follow-ups, today's follow-ups and upcoming interviews, with a "Done" button
- Extra details per application: job link, location and source
- Backend validation for required fields and allowed status valuesgit 

## Tech Stack
- Java 21, Spring Boot, Spring Data JPA (Hibernate)
- MySQL
- Maven
- HTML, CSS and JavaScript (frontend served by Spring Boot)

## Architecture
Controller → Service → Repository → MySQL

## How to run
1. Install Java 21, Maven and MySQL.
2. In MySQL, create the database: `CREATE DATABASE jobtrack_db;` (tables are created automatically by Hibernate)
3. Set your MySQL credentials as environment variables (do not commit real credentials):

   **Windows (PowerShell)**
   ```powershell
   $env:DB_USERNAME="your_username"
   $env:DB_PASSWORD="your_password"
   ```
   **Linux / macOS**
   ```bash
   export DB_USERNAME=your_username
   export DB_PASSWORD=your_password
   ```
4. Start the application from the project root and open `http://localhost:8080`:
   ```bash
   mvn spring-boot:run
   ```

## Author
Atharva Patil, github.com/AtharvvAP