
# Employee Management System Backend

The Employee Management System is a web application developed using Spring Boot. It provides functionalities to manage employees within an organization including adding new employees, updating existing employee details, deleting employees, and retrieving employee information.


## Features

- Create Employee: Add a new employee to the system with details such as name, email, department, etc.
- Update Employee: Modify the details of an existing employee including name, email, department, etc.
- Delete Employee: Remove an employee from the system based on their unique identifier.
- Retrieve Employee: Fetch details of a specific employee or list all employees currently registered in the system.


## Tech Stack

**Client:** Postman API Client

**Server:** JAVA SpringBoot,Spring Data JPA, Hibernate, Maven, Mysql

## Prerequisites
- Java Development Kit (JDK) 
- Maven
- Postman (for testing endpoints)
- IntelliJ Idea(IDE)
- Mysql workbench.

## Running the Application
- Clone this repository to your local machine.
- Navigate to the project directory.
- Run the SpringbootBackendApplication.java(main) class.

## Testing Endpoints
Open Postman or any REST API client.
Use the following endpoints to test the functionalities:
- Create Employee: POST http://localhost:8080/api/employees
- Update Employee: PUT http://localhost:8080/api/employees/{employeeId}
- Delete Employee: DELETE http://localhost:8080/api/employees/{employeeId}
- Retrieve Employee by ID: GET http://localhost:8080/api/employees/{employeeId}
- Retrieve All Employees: GET http://localhost:8080/api/employees

## Contributors
Shardul Gusain