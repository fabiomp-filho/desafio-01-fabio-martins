# desafio-01-fabio-martins

Desafio I - Compass UOL - SP Spring Boot + AWS - 21-08-2023

# Car Management API

This is a sample API for managing information about cars. It was built using Java Spring Boot and communicates with a
MySQL database. The API provides CRUD (Create, Read, Update, Delete) operations for the CarModel entity.

# Configuration

To run the application, you need to set up a MySQL database and update the connection settings in the
application.properties file. You can also use Docker Compose to set up a MySQL container. Use the following example as a
starting point:

# Database settings

* spring.datasource.url=jdbc:mysql://localhost:3306/db_car
* spring.datasource.username=root
* spring.datasource.password=root
* spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
* spring.jpa.hibernate.ddl-auto=update
* spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

# Endpoints

1. **Save a Car**
    * URL: /cars/save
    * HTTP Method: POST
    * Request Body (JSON):
        * {
          "model": "Car Model",
          "brand": "Ford" or "Chevrolet" or "BMW" or "Volvo",
          "color": "Car Color",
          "fabricationYear": "year/year"
          }
    * Response:
        * Returns the details of the saved car.

2. **Update a Car**
    * URL: /cars/update/{id}
    * HTTP Method: PUT
    * URL Parameters: id - chassisId of the car to be updated.
    * Request Body (JSON):
        * {
          "model": "New Model",
          "brand": "New Brand",
          "color": "New Color",
          "fabricationYear": "year/year"
          }
    * Response:
        * Returns the details of the updated car.

3. **Get All Cars (Paginated)**
    * URL: /cars/get-all
    * HTTP Method: GET
    * Request Parameters: None
    * Response:
        * Returns a paginated list of cars.

4. **Get a Car by ID**
    * URL: /cars/get/{id}
    * HTTP Method: GET
    * URL Parameters: id - chassisId of the car to be retrieved.
    * Response:
        * Returns the details of the car with the specified ID.

5. **Delete a Car by ID**
    * URL: /cars/delete/{id}
    * HTTP Method: DELETE
    * URL Parameters: id - chassisId of the car to be deleted.
    * Response:
        * Returns a success message after deletion.

# Usage
Here are some examples of how to use the API:

* To save a car, make a POST request to /cars/save with the car details in the request body.
* To update a car, make a PUT request to /cars/update/{id} with the updated details in the request body and the car's ID in the URL.
* To get all cars, make a GET request to /cars/get-all.
* To get a car by ID, make a GET request to /cars/get/{id} with the car's ID in the URL.
* To delete a car by ID, make a DELETE request to /cars/delete/{id} with the car's ID in the URL.

# Contributions

Feel free to contribute to this project. You can open issues, submit enhancement requests, or send pull requests.

