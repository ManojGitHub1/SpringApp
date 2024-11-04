# Spring and Spring Boot Learning Project
### This project is a collection of my learnings and implementations in Spring and Spring Boot, covering essential components of modern web development with Java. Key topics include understanding the Spring framework, using Spring Boot for rapid development, interacting with H2 databases, implementing the MVC model, libraries for efficient development.

## Technologies Used
1. Java: Primary programming language.
2. Spring Boot: Framework for rapid application development.
3. H2 Database: In-memory database for development and testing.
4. JPA: Specification for ORM to interact with the database.
5. Hibernate: ORM framework, implementing JPA.
6. JDBC: Java Database Connectivity for database operations.
7. Postman: Tool for testing REST APIs.

## Key Concepts
### Spring Boot
Spring Boot simplifies the setup and development of Spring applications, providing built-in configurations and reducing boilerplate code. It uses an embedded server, making it ideal for quickly developing web applications without extensive setup.

### H2 Database
H2 is an in-memory database commonly used for development and testing. It allows for easy setup with Spring Boot, making it ideal for lightweight, fast applications. H2 is configured to reset with each application restart, providing a clean state each time.

### Java Persistence API (JPA)
JPA is a Java specification for accessing, persisting, and managing data between Java objects and relational databases. In this project, JPA is used to map Java classes to database tables and manage relationships between entities.

### Object-Relational Mapping (ORM)
ORM is a technique for mapping an object-oriented domain model to a relational database. In this project, Hibernate serves as the ORM provider, allowing us to map Java classes to database tables and manage database interactions in an object-oriented way.

### Controller-Service-Repository Pattern
This architectural pattern divides the responsibilities:
Controller: Handles HTTP requests, interacts with services, and returns responses.
Service: Contains business logic and interacts with repositories.
Repository: Manages data access and retrieval. In this project, JPA repositories are used, providing CRUD methods.

### Hibernate
Hibernate is an ORM tool that implements the JPA specification, making it possible to manage data in Java applications using annotations. It automatically maps Java classes to database tables and handles complex database operations.

### JDBC
JDBC (Java Database Connectivity) is the standard Java API for interacting with databases. Spring provides support for JDBC, and it can be used in cases where ORM might be too heavyweight for simple data operations.

### Basic Annotations
@Autowired: Used for dependency injection, allowing Spring to manage object creation and injection automatically.
@RequestMapping: Maps HTTP requests to handler methods in controllers.
@RestController: Used to define a controller in Spring MVC. It combines @Controller and @ResponseBody to simplify the creation of RESTful APIs.
@GetMapping and @PostMapping: Specialized annotations for mapping HTTP GET and POST requests.
@Entity: Specifies that a class is an entity and is mapped to a database table.
@Id: Used in conjunction with @Entity to specify the primary key of an entity.

### Development Workflow
The application follows the Model-View-Controller (MVC) model:

Model: Represents data and business logic, managed through JPA and entities.
View: Not directly applicable as this is a backend API-focused project, but could be represented by JSON responses.
Controller: Manages client requests and responses.
Additional components like Lombok simplify code by providing automatic generation of getters, setters, and other boilerplate code. JpaRepository is used for managing entity persistence without requiring custom SQL.
