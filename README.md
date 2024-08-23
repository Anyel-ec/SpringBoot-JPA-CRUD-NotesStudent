### Project 1: SpringBoot-Notes
# SpringBoot-ManagerNotes of Student

The main objective of this API is to manage student grades in different evaluation areas.

## Features

- Management of students and their grades.
- API documented with Swagger for easy interaction.
- Data persistence in a MySQL database.

## Environment Configuration

### MySQL

Configure your MySQL database using the following parameters:

```properties
spring.datasource.url = jdbc:mysql://localhost:3306/prueba_u3_distribuidas
spring.datasource.username = root
spring.datasource.password = anyel
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```

### Swagger

Access to the API documentation is enabled and can be accessed at the following path:

```properties
springdoc.swagger-ui.path=/swagger-ui.html
```

## Hibernate Configuration

The Hibernate configuration is set to automatically update the database structure on each application startup:

```properties
spring.jpa.hibernate.ddl-auto = update
```

## Main Endpoints

- **Save student and grades:** `POST /api/v1/appd/save`
- **Count students with grades:** `GET /api/v1/appd/count`
- **Get students with grades greater than or equal to a certain value:** `GET /api/v1/appd/gradesGreaterOrEqual/{grade}`
- **Get students with grades less than a certain value:** `GET /api/v1/appd/gradesLessThan/{grade}`
- **Get students within a range of grades:** `GET /api/v1/appd/range?minApp={minApp}&maxApp={maxApp}`

## Documentation

The API documentation is available at:

```
http://localhost:8080/swagger-ui.html
```

## Author

Developed by Anyel EC | [cyberdevmatrix@gmail.com](mailto:cyberdevmatrix@gmail.com)


### Project 2: Introduce-CRUD-MongoDB
# Introduce-CRUD-MongoDB

This project is an API developed with Spring Boot that performs CRUD operations on a MongoDB database. It focuses on handling numbers and determining if they are prime.

## Features

- Generation and storage of numbers in a MongoDB database.
- Prime number calculation.
- API documented with Swagger for easy interaction.

## Environment Configuration

### MongoDB

Configure your MongoDB database using the following parameters:

```properties
spring.data.mongodb.host = localhost 
spring.data.mongodb.port = 27017 
spring.data.mongodb.database = prueba_primos
```

### Swagger

Access to the API documentation is enabled and can be accessed at the following path:

```properties
springdoc.swagger-ui.path=/swagger-ui.html
```

## Main Endpoints

- **Save numbers up to a specified limit:** `POST /api/appd/numbers?limitApp={limitApp}`

## Documentation

The API documentation is available at:

```
http://localhost:8080/swagger-ui.html
```

## Author

Developed by Anyel EC | [cyberdevmatrix@gmail.com](mailto:cyberdevmatrix@gmail.com)
