
# Movie Review Apllication


This is a full-stack movie review application with a Java Spring Boot backend, MongoDB Atlas database, and React frontend. The application allows users to create, read, update, and delete (CRUD) movie reviews.




## Tech Stack

**Backend:** Java, Springboot

**Database:** MongoDB Atlas

**Frontend:** React, Axios

**Prerequisite:** 

**1.** Java Development Kit (JDK) 17

**2.** Node.js and npm

**3.** MongoDB Atlas account

**4.** Postman (for API testing)




## Run Locally

**Backend Setup (Spring Boot)**

**Clone the project**

```bash
  git clone https://github.com/Buckyvs/Movie-Meter-Gold.git
```

**Configure MongoDB Atlas**

Create a MongoDB Atlas cluster.
Whitelist your IP address.
Create a database user and get the connection string.
Update src/main/resources/application.properties with your MongoDB Atlas connection details:

```bash
  spring.data.mongodb.uri=mongodb+srv://<username>:<password>@cluster0.mongodb.net/moviereviewdb?retryWrites=true&w=majority
```

**Build and Run the Backend**

The backend server will start at http://localhost:8080.

```bash
  ./mvnw clean install
  ./mvnw spring-boot:run
```

**Frontend Setup (React)**

**Navigate to the Frontend Directory**

```bash
  ncd ../frontend
```
**Install Dependencies**

```bash
  npm install
```
**Run the Frontend**

The React app will start at http://localhost:3000.

```bash
  npm start
```


## Acknowledgements

  React App

This project was bootstrapped with [Create React App](https://github.com/facebook/create-react-app).

