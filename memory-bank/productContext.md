# Product Context

This file provides a high-level overview of the project and the expected product that will be created. Initially it is based upon projectBrief.md (if provided) and all other available project-related information in the working directory. This file is intended to be updated as the project evolves, and should be used to inform all other modes of the project's goals and context.
2025-05-26 14:51:39 - Log of updates made will be appended as footnotes to the end of this file.

*

## Project Goal

*   To develop a TLIAS (Smart Learning Auxiliary System) web management backend, providing functionalities for managing departments, employees, classes, students, and generating statistical reports. The system also includes features for logging, user authentication, and file uploads.

## Key Features

*   Department Management: CRUD operations for departments. Includes a restriction that a department cannot be deleted if it has associated employees.
*   Employee Management: CRUD operations for employees, including their work experience.
*   Class Management: CRUD operations for classes.
*   Student Management: CRUD operations for students, including disciplinary actions.
*   Data Statistics: Generation of reports for employee gender, employee job distribution, student academic degrees, and student count per class.
*   Operational Logging: Recording of system operations.
*   User Authentication: Secure login for employees using JWT.
*   File Upload: Support for uploading files (e.g., images for employees).

## Overall Architecture

*   **Technology Stack**: Java, Spring Boot, MyBatis, MySQL (assumed), Aliyun OSS.
*   **Architecture Pattern**: Three-tier architecture (Controller, Service, Mapper/DAO).
*   **API Style**: RESTful APIs.
*   **Authentication**: JWT-based authentication.
*   **Error Handling**: Global exception handling mechanism.
*   **Data Transfer Objects (DTOs/POJOs)**: Used for request and response data.
*   **Modularity**: Clearly defined modules for different functionalities (Dept, Emp, Clazz, Student, Report, Log, Login, Upload).

## API Endpoint Summary (High-Level)

*   **Department Management (`/depts`)**:
    *   `GET /depts`: List all departments.
    *   `DELETE /depts/{id}` or `DELETE /depts?id=...`: Delete a department by ID.
    *   `POST /depts`: Add a new department.
    *   `GET /depts/{id}`: Get a department by ID.
    *   `PUT /depts`: Update a department.
*   **Employee Management (`/emps`)**:
    *   `GET /emps`: List employees with pagination and filtering.
    *   `DELETE /emps?ids=...`: Batch delete employees by IDs.
    *   `POST /emps`: Add a new employee (including work experience).
    *   `GET /emps/{id}`: Get an employee by ID (including work experience).
    *   `PUT /emps`: Update an employee (including work experience).
    *   `GET /emps/list`: List all employees (no pagination, for dropdowns etc.).
*   **Class Management (`/clazzs`)**:
    *   `GET /clazzs`: List classes with pagination and filtering.
    *   `DELETE /clazzs/{id}`: Delete a class by ID.
    *   `POST /clazzs`: Add a new class.
    *   `GET /clazzs/{id}`: Get a class by ID.
    *   `PUT /clazzs`: Update a class.
    *   `GET /clazzs/list`: List all classes (no pagination).
*   **Student Management (`/students`)**:
    *   `GET /students`: List students with pagination and filtering.
    *   `DELETE /students/{ids}`: Batch delete students by IDs.
    *   `POST /students`: Add a new student.
    *   `GET /students/{id}`: Get a student by ID.
    *   `PUT /students`: Update a student.
    *   `PUT /students/violation/{id}/{score}`: Record a student violation.
*   **Data Statistics (`/report`)**:
    *   `GET /report/empGenderData`: Employee gender statistics.
    *   `GET /report/empJobData`: Employee job distribution statistics.
    *   `GET /report/studentDegreeData`: Student academic degree statistics.
    *   `GET /report/studentCountData`: Student count per class statistics.
*   **Logging (`/log`)**:
    *   `GET /log/page`: List log entries with pagination.
*   **Authentication (`/login`)**:
    *   `POST /login`: Employee login, returns JWT.
*   **File Upload (`/upload`)**:
    *   `POST /upload`: Upload a file (e.g., image).

(Note: Full request/response details, including all fields, are in the `api接口文档.pdf`.)

[2025-05-26 14:52:20] - Initial population of Project Goal, Key Features, Overall Architecture and API Endpoint Summary based on API documentation and task description.