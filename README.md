# 🚖 Taxi-Service 🚖
### Project description: 

The Taxi-Service project is a Java web application that allows users to manage taxi services, including creating and managing manufacturers, cars, and drivers.  

   + The project uses **JDBC** with **RDBMS** to store and retrieve data, and Java Servlet API and JSP (JavaServer Pages) for web development, with Tomcat as the web server.
   + Specifically, the project was designed to follow **SOLID** principles of object-oriented programming. It implements the **Dependency Injection** principle by field injection. This allows the project to decouple its components and to make them more testable and reusable.
## 🔎 Features
The following features have been implemented in the project:

#### Manufacturers
* Create a new manufacturer with a name and country.
* View a list of all manufacturers in the system.
#### Cars
* Create a new car with a specific manufacturer, and model.
* Assign a driver to a specific car.
* View a list of all cars in the system, with information about their manufacturer, model, and assigned drivers.
#### Drivers
* Register as a new driver with a username, password, and license number.
* Authenticate as a driver with a valid username and password.
* View a list of all cars assigned to the current driver.

## 🛠️ Getting Started
1. To run the project, you will need to have the following software installed on your system:

   + Java Development Kit (JDK) 1.8 or later.  
   + Apache Maven 3.6.0 or later.
   + MySQL 8.0 or another RDBMS.
   + Tomcat 9.0 or another web-server.
   
>Note: You can download and install these software packages by following the instructions on their respective websites.

>Note: Followed steps actual for the Tomcat web server if you will use another mast deploying project according to your web server.

2. After installing the required software, you can download the project source code from the GitHub repository:

```command
git clone https://github.com/BusyhinD/taxi-service
```
3. To configure the project, you need to edit the ConnectionUtil class (in the **_util_** project folder) to pass the login, password, your database URL, and driver for your database management system.

4. Then, you can build the project using Maven:

```command
cd taxi-service
mvn package
```
5. This will create a WAR (Web Application Archive) file in the target directory, which you can deploy to Tomcat:

```command
cp target/taxi-service.war $CATALINA_HOME/webapps
```
>
6. Finally, you can start Tomcat (or your web-server) and access the application by navigating to http://localhost:8080/taxi in your web browser.
## ☕ Conclusion
That's it! With the Taxi Service project, you can manage your taxi services easily and efficiently. If you have any questions or issues with the project, please don't hesitate to contact me.
