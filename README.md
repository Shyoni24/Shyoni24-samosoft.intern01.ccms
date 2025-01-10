README.md for Client Service
text
# Client Service

The **Client Service** is a microservice built using Spring Boot that manages client-related operations. It provides RESTful APIs to create, retrieve, and delete client information.

## Features
- Manage client data (CRUD operations).
- Built with Spring Boot and Java 17.
- Uses MongoDB for data storage.
- Easily deployable with Docker and Docker Compose.

## Prerequisites
1. **Java 17** or later installed on your system.
2. **Maven** installed for building the project.
3. MongoDB installed and running locally on port `27017`.

## Project Structure
client-service/
├── src/
│ ├── main/
│ │ ├── java/com/example/clientservice/
│ │ │ ├── model/ # Domain models (e.g., Client.java)
│ │ │ ├── repository/ # Data access layer (e.g., ClientRepository.java)
│ │ │ ├── service/ # Business logic (e.g., ClientService.java)
│ │ │ └── controller/ # REST API controllers (e.g., ClientController.java)
│ └── resources/
│ ├── application.properties # Configuration file
├── Dockerfile # Docker containerization
├── pom.xml # Maven dependencies and build configuration
└── README.md # Project documentation
text

## Technologies Used
- **Spring Boot 3.x**
- **Spring Data MongoDB**
- **Maven**

## Configuration
Set up your MongoDB connection details in `src/main/resources/application.properties`:
spring.data.mongodb.uri=mongodb://localhost:27017/clientdb
server.port=8081
text

## How to Run
### 1. Run Locally
1. Build the project:
./mvnw clean install
text
2. Run the application:
./mvnw spring-boot:run
text
3. Access the service at `http://localhost:8081/api/clients`.

### 2. Run with Docker Compose (Optional)
1. Add this service to your `docker-compose.yml`.
2. Start all services:
docker-compose up --build -d
text

## API Endpoints
### Get All Clients
**GET** `/api/clients`

### Create a New Client
**POST** `/api/clients`
#### Request Body Example:
{
"name": "John Doe",
"email": "johndoe@example.com"
}
text

### Delete a Client
**DELETE** `/api/clients/{id}`

## Troubleshooting
### Common Issues:
1. **MongoDB Connection Error**:
    - Ensure MongoDB is running on port `27017`.
2. **Port Conflicts**:
    - If port `8081` is already in use, change it in `application.properties`.

## Future Enhancements
1. Implement pagination for client retrieval.
2. Add search functionality for clients.

## License
This project is licensed under the [MIT License](LICENSE).

## Contact
For any questions or issues, please contact [Your Name] at [your-email@example.com].
README.md for Configuration Service
text
# Configuration Service

The **Configuration Service** is a microservice built using Spring Boot that manages client-specific configurations. It provides RESTful APIs to create, retrieve, and delete configurations associated with clients.

## Features
- Manage client configurations (CRUD operations).
- Built with Spring Boot and Java 17.
- Uses MongoDB for data storage.
- Easily deployable with Docker and Docker Compose.

## Prerequisites
1. **Java 17** or later installed on your system.
2. **Maven** installed for building the project.
3. MongoDB installed and running locally on port `27017`.

## Project Structure
configuration-service/
├── src/
│ ├── main/
│ │ ├── java/com/example/configurationservice/
│ │ │ ├── model/ # Domain models (e.g., Configuration.java)
│ │ │ ├── repository/ # Data access layer (e.g., ConfigurationRepository.java)
│ │ │ ├── service/ # Business logic (e.g., ConfigurationService.java)
│ │ │ └── controller/ # REST API controllers (e.g., ConfigurationController.java)
│ └── resources/
│ ├── application.properties # Configuration file
├── Dockerfile # Docker containerization
├── pom.xml # Maven dependencies and build configuration
└── README.md # Project documentation
text

## Technologies Used
- **Spring Boot 3.x**
- **Spring Data MongoDB**
- **Maven**

## Configuration
Set up your MongoDB connection details in `src/main/resources/application.properties`:
spring.data.mongodb.uri=mongodb://localhost:27017/configurationdb
server.port=8082
text

## How to Run
### 1. Run Locally
1. Build the project:
./mvnw clean install
text
2. Run the application:
./mvnw spring-boot:run
text
3. Access the service at `http://localhost:8082/api/configurations`.

### 2. Run with Docker Compose (Optional)
1. Add this service to your `docker-compose.yml`.
2. Start all services:
docker-compose up --build -d
text

## API Endpoints

### Get Configurations by Client ID 
**GET** `/api/configurations/{clientId}`

### Create a New Configuration 
**POST** `/api/configurations`
#### Request Body Example:
{
"clientId": "client123",
"settingKey": "theme",
"settingValue": "dark"
}
text

### Delete a Configuration 
**DELETE** `/api/configurations/{id}`

## Troubleshooting

### Common Issues:
1. **MongoDB Connection Error**:
    - Ensure MongoDB is running on port `27017`.
2. **Port Conflicts**:
    - If port `8082` is already in use, change it in `application.properties`.

## Future Enhancements

1. Implement validation for configuration inputs.
2. Add support for multiple configuration types.

## License

This project is licensed under the [MIT License](LICENSE).

## Contact

For any questions or issues, please contact [Your Name] at [your-email@example.com].
README.md for Notification Service
text
# Notification Service

The **Notification Service** is a microservice built using Spring Boot that handles email notifications for clients within the Client Configuration Management System (CCMS). It allows sending email notifications via a REST API.

## Features

- Send email notifications via REST API.
- Built with Spring Boot and Java 17.
- Uses Spring Boot Starter Mail for email functionality.
- Easily deployable with Docker and Docker Compose.

## Prerequisites

1. **Java 17** or later installed on your system.
2. **Maven** installed for building the project.
3. An SMTP server (e.g., Gmail, SendGrid) for sending emails.
4. Docker (optional, for containerized deployment).

## Project Structure

notification-service/
├── src/
│ ├── main/
│ │ ├── java/com/example/notificationservice/
│ │ │ ├── model/ # Domain models (e.g., Notification.java)
│ │ │ ├── service/ # Business logic (e.g., NotificationService.java)
│ │ │ └── controller/ # REST API controllers (e.g., NotificationController.java)
│ └── resources/
│ ├── application.properties # Configuration file for SMTP settings
├── Dockerfile # Docker containerization
├── pom.xml # Maven dependencies and build configuration
└── README.md # Project documentation
text

---

## Technologies Used

- **Spring Boot 3.x**
- **Spring Boot Starter Mail**
- **JavaMailSender**
- **Maven**
- **Docker**

---

## Configuration

### Email Configuration

Set up your SMTP server details in `src/main/resources/application.properties`:

spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=your-email@gmail.com
spring.mail.password=your-email-password
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
server.port=8083
text
Replace `your-email@gmail.com` and `your-email-password` with valid credentials.

---

## How to Run

### 1. Run Locally

1. Build the project:

./mvnw clean install
text
   
2. Run the application:

./mvnw spring-boot:run
text
   
3. Access the service at `http://localhost:8083`.

### 2. Run with Docker Compose (Optional)

1. Add this service to your `docker-compose.yml`.
   
2. Start all services:

docker-compose up --build -d
text

---

## API Endpoints

### Send Notification

**POST** `/api/notifications/send`

#### Request Body Example:

{
"recipientEmail": "recipient@example.com",
"subject": "Test Email",
"messageBody": "This is a test email sent from Spring Boot."
}
text

#### Response:

- **200 OK**: Email sent successfully.
- **400 Bad Request**: Invalid input data.
- **500 Internal Server Error**: SMTP server error.

---

## Troubleshooting 

### Common Issues:

1. **SMTP Authentication Error**:
    - Ensure "Allow less secure apps" is enabled in your Google account settings (for Gmail).
    - Alternatively, generate an App Password for enhanced security.

2. **Port Conflicts**:
    - If port `8083` is already in use, change it in `application.properties`:

server.port=8084
text

3. **Dependency Issues**:
    - Ensure the following dependency exists in your `pom.xml`:

<dependency> <groupId>org.springframework.boot</groupId> <artifactId>spring-boot-starter-mail</artifactId> </dependency> ```
