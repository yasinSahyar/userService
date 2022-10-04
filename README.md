# userService

Java assignment 1

The purpose of this assignment is to evaluate the knowledge and experience
working with Java Web development

● Language: Java 11 or above

● Framework: Spring Boot

● Database: PostgreSQL

Requirements
You’re tasked to develop the backend for a personal TODO application that requires
users to be logged in before they can call the APIs. One user can create multiple todo
items and one todo item can only belong to a single user. The data model of a todo
item & user is as follows:
Todo:
● Id: Unique identifier
● Name: Name of the todo item
● Description (optional): Description of the toto item
● User id: Id of the user who owns this todo item
● Created timestamp: When the item is created
● Updated timestamp: When the item is last updated
● Status: An enum of either: NotStarted, OnGoing, Completed
User:
● Id: Unique identifier
● Email: Email address
● Password: Hash of the password
● Created timestamp: When the user is created
● Updated timestamp: When the user is last updated
Core features
Develop a backend application using Java & Spring Boot framework that exposes a
set of REST APIs for the following endpoints:
● POST /api/v1/signup: Sign up as an user of the system, using email & password
● POST /api/v1/signin: Sign in using email & password. The system will return the
JWT token that can be used to call the APIs that follow.
● PUT /api/v1/changePassword: Change user’s password
● GET /api/v1/todos?status=[status]: Get a list of todo items. Optionally, a status
query param can be included to return only items of specific status. If not
present, return all items
● POST /api/v1/todos: Create a new todo item
● PUT /api/v1/todos/:id: Update a todo item
● DELETE /api/v1/todos/:id: Delete a todo item
Code structure
Put the code in an idiomatic structure with clear responsibilities between different
layers:
● Controllers
● Services
● Repositories
Use dependency injection as much as you can. Document how to run the code
clearly in the README file and then put the code into a Github repository
Optional
● Write unit tests for the services layer
● Package the backend into a Docker container. You can use Docker compose
as well to run both the web server and database server
