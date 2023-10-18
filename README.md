# <h1 align="center">Todo CRUD Operations</h1>
<p align="center">
  <a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
  </a>
  <a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-4.0-brightgreen.svg" />
  </a>
  <a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.1.3-brightgreen.svg" />
  </a>
   <img alt = "GPL v3" src="https://img.shields.io/badge/License-GPLv3-blue.svg" />
</p>

---

<p align="left">


## Introduction

The Todo project is a feature-rich web application built using Spring Boot that allows users to efficiently manage their tasks. Users can create, read, update, and delete tasks with different statuses, including "Pending," "Started," "Done," and "Delayed.


## Technologies Used

- **Framework:** Spring Boot
- **Language:** Java
- **Build Tool:** Maven

## Data Flow Diagram



                             ┌─────────────────────────┐
                             │        Todo API         │
                             └───────────┬─────────────┘
                                         │
                                         ▼
                             ┌─────────────────────────┐
                             │       Controllers       │
                             └───────────┬─────────────┘
                                         │
                                         ▼
                             ┌─────────────────────────┐
                             │       Services          │
                             └───────────┬─────────────┘
                                         │
                                         ▼
                             ┌─────────────────────────┐
                             │       Repositories      │
                             └───────────┬─────────────┘
                                         │
                                         ▼
                             ┌─────────────────────────┐
                             │       Database          │
                             └─────────────────────────┘



## Core Features

- **User-Friendly Interface** : A clean and intuitive user interface for managing tasks.
- **Task Management**: Create, read, update, and delete tasks effortlessly.
- **Status Tracking**: Categorize tasks with different statuses to keep track of their progress.
- **Batch Operations**: Perform batch operations for adding and deleting multiple tasks.
- **Filtering**: Retrieve tasks based on their status for better organization.
- **Database Integration**: Utilizes Spring Data JPA with database.



## Project Flow

### Create a Task
1. Click on "Add Task" to open the task creation form.
2. Provide a title, description, and select a status for the task.
3. Click the "Save" button to add the task.

### View Task List
- The main page displays the list of tasks with their titles, descriptions, and statuses.

### Update Task Status
1. To update the status of a task, click on the task in the list.
2. Choose a new status from the dropdown and click the "Update" button.

### Delete a Task
1. To delete a task, click on the task in the list.
2. Click the "Delete" button to remove the task.

## View Tasks by Status
- Use the filter dropdown to view tasks based on their status.

## Batch Operations
### Add Multiple Tasks
1. Navigate to the "Batch Add" page.
2. Enter task details for multiple tasks and click the "Add" button.

### Delete Multiple Tasks
1. Go to the "Batch Delete" page.
2. Enter the task IDs you wish to delete, separated by commas, and click the "Delete" button.


## Project Structure

The project directory structure is organized as follows:

- `src/` - Source code files.
- `src/main/java/com/projectRaj/Todo/` - Java source files.
- `src/main/resources/` - Configuration and resource files.
- `src/test/` - Unit and integration test files.
- `target/` - Compiled classes and JAR files.

## API Endpoints
## CurdController

The `CurdController` is responsible for handling CRUD (Create, Read, Update, Delete) operations for tasks in the Todo application. It provides RESTful API endpoints to interact with task-related data.

#### Access the Application

The application will be available at  
```
http://localhost:8080
```

#### 1. Create a Task

- Endpoint: 
```
POST /api/task
```
- Description: Add a single task to the system.
- Request: A JSON object representing the task to be added.
- Response:
  - 200 OK: Task added successfully.
  - 500 Internal Server Error: Failed to add the task. Please check your request.

#### 2. Create Multiple Tasks

- Endpoint: 
```
POST /api/tasks
```
- Description: Add multiple tasks in batch to the system.
- Request: A JSON array representing a list of tasks to be added.
- Response:
  - 200 OK: Tasks added successfully.
  - 500 Internal Server Error: Failed to add tasks. Please check your request.

#### 3. Update Task Status

- Endpoint: 
```
PUT /api/status
```
- Description: Update the status of a task with the provided task ID.
- Request: Query parameters `id` (task ID) and `status` (new status).
- Response:
  - 200 OK: Task status updated successfully.
  - 500 Internal Server Error: Failed to update task status. Please check your request.

#### 4. Delete a Task

- Endpoint: 
```
DELETE /api/task/id
```
- Description: Delete a task with the provided task ID.
- Request: Query parameter `id` (task ID).
- Response:
  - 200 OK: Task deleted successfully.
  - 500 Internal Server Error: Failed to delete the task. Please check your request.

#### 5. Delete Multiple Tasks

- Endpoint: 
```
DELETE /api/tasks/ids
```
- Description: Delete multiple tasks in batch with the provided task IDs.
- Request: Query parameter `ids` (comma-separated task IDs).
- Response:
  - 200 OK: Tasks deleted successfully.
  - 500 Internal Server Error: Failed to delete tasks. Please check your request.

This controller allows you to perform various operations on tasks, including adding, updating, and deleting them. It also provides endpoints to add or delete tasks in batches, making task management more efficient.

## GetApis

The `GetApis` class contains endpoints that allow users to retrieve task-related information from the Todo application.

### Endpoints

#### 1. Get User Tasks

- Endpoint: 
```
GET /api/todo/userTasks
```
- Description: Retrieve a list of all tasks in the system.
- Response: A JSON array containing task objects.

#### 2. Get Task Status by ID

- Endpoint: 
```
GET /api/todo/status/{id}
```
- Description: Retrieve the status of a task by providing the task's ID.
- Request: Path parameter `{id}` representing the task ID.
- Response: A string representation of the task's status.

#### 3. Find Tasks by Title

- Endpoint: 
```
GET /api/todo/title/{title}
```
- Description: Find tasks in the system by their titles.
- Request: Path parameter `{title}` representing the task title.
- Response: A JSON array containing task objects that match the provided title.

#### 4. Find Tasks by Status

- Endpoint: 
```
GET /api/todo/status
```
- Description: Retrieve a list of tasks based on a selected status.
- Request: Query parameter `status` (status to filter by).
- Response: A JSON array containing task objects with the specified status.

These endpoints provide various ways to retrieve task information. Users can get a list of all tasks, find tasks by title, and filter tasks by status based on their requirements.


## Contributing

Contributions to this project are welcome. If you have any suggestions, improvements, or feature requests, please create a pull request or open an issue.

Thank you for considering this backend design as a starting point for your Instagram-like platform. Good luck with your project!



## Swagger Configuration
```
http://localhost:8080/swagger-ui/index.html#/
```
## Contact Information

If you have any questions, issues, or need further assistance related to the  Model-Based CRUD Operations Portal project, feel free to contact us. We are here to help!

- **Raj Anand**
  - Email: rajanandirctc@gmail.com
  - LinkedIn: [Raj Anand's LinkedIn Profile]()
  - GitHub: [Raj Anand's GitHub Profile]()


Please don't hesitate to reach out if you have any inquiries or need assistance with any aspect of the project. Your feedback and questions are important to us.



