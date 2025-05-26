# System Patterns *Optional*

This file documents recurring patterns and standards used in the project.
It is optional, but recommended to be updated as the project evolves.
2025-05-26 14:52:10 - Log of updates made.

*

## Coding Patterns

*   **Lombok Annotations**: Extensive use of `@Data`, `@NoArgsConstructor`, `@AllArgsConstructor` for boilerplate code reduction in POJOs.
*   **Spring Boot Annotations**: Standard Spring Boot annotations like `@RestController`, `@Service`, `@Mapper`, `@Autowired`, `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping`, `@PathVariable`, `@RequestBody`, `@RequestParam` are expected to be used throughout the controller, service, and mapper layers.
*   **Java Time API**: Use of `LocalDate` and `LocalDateTime` for date/time fields.
*   **DTOs/POJOs for API Contracts**: Data transfer objects are used to define the structure of requests and responses.
*   **Custom Exceptions**: For specific business rule violations (e.g., [`DeptNotEmptyException.java`](src/main/java/com/itheima/exception/DeptNotEmptyException.java)).
*   **SLF4J/Logback for Logging**: Implied by the presence of [`logback.xml`](src/main/resources/logback.xml) and typical for Spring Boot applications.

## Architectural Patterns

*   **Three-Tier Architecture**:
    *   **Controller Layer** ([`com.itheima.controller`](src/main/java/com/itheima/controller/)): Handles HTTP requests, request validation (implicit), and delegates to the service layer.
    *   **Service Layer** ([`com.itheima.service`](src/main/java/com/itheima/service/) and [`com.itheima.service.impl`](src/main/java/com/itheima/service/impl/)): Contains business logic, transaction management (implicit via Spring), and coordinates mappers.
    *   **Mapper/DAO Layer** ([`com.itheima.mapper`](src/main/java/com/itheima/mapper/)): Interfaces with the database using MyBatis. SQL queries are defined in XML files (e.g., [`EmpMapper.xml`](src/main/resources/com/itheima/mapper/EmpMapper.xml)).
*   **RESTful API Design**: Adherence to REST principles for API endpoints (HTTP methods, resource-based URLs).
*   **Global Exception Handling**: Centralized exception handling using `@ControllerAdvice` and `@ExceptionHandler` in [`GlobalExceptionHandler.java`](src/main/java/com/itheima/exception/GlobalExceptionHandler.java).
*   **Dependency Injection**: Spring framework manages dependencies.
*   **Configuration Management**: Application properties managed in [`application.yml`](src/main/resources/application.yml).
*   **JWT-based Authentication**: As per API documentation (section 6.1), a filter or interceptor (not explicitly listed in files but standard practice) would handle JWT validation for protected endpoints.
*   **Aliyun OSS for File Storage**: Indicated by [`AliyunOSSOperator.java`](src/main/java/com/itheima/utils/AliyunOSSOperator.java) and [`AliyunOSSProperties.java`](src/main/java/com/itheima/utils/AliyunOSSProperties.java).

## Testing Patterns

*   JUnit and Spring Test utilities are expected for unit and integration testing (implied by `src/test/java/` and `pom.xml` dependencies, though specific test patterns are not detailed in the provided context).

[2025-05-26 14:55:04] - Documented common coding and architectural patterns observed or inferred from the project structure and API documentation.