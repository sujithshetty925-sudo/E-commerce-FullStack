1.E-Commerce Full Stack Application
A full-stack e-commerce web application built with a *React* frontend and a *Spring Boot* REST API backend, backed by *MySQL*. It provides a complete shopping experience — browsing products, managing a cart, placing orders, user login, and an admin-side product management flow.

2.Overview
This project combines two parts into a single deployable application:
Frontend — a modern, responsive React interface for browsing products, searching, viewing product details, managing the cart, checking out, and viewing order history/profile.
Backend— a Spring Boot REST API that handles product, category, cart, order, and user data, backed by MySQL.

3.Features
 Home page with product listing and search
 Product details page
 Add to Cart / Buy Now
 Checkout page with demo payment flow
 Order success page and order history ("My Orders")
 User login/signup and profile page
 Admin-side product management (add, update, delete, view products and categories)
 Responsive navigation bar and footer, mobile-friendly UI

4.Tech Stack
Frontend
 React.js
 JavaScript 
 HTML5, CSS3
 Axios (API calls)
 React Router DOM

Backend 
 Java 17
 Spring Boot
 Spring Data JPA / Hibernate
 MySQL
 RESTful API architecture

5.Project Structure
E-commerce-FullStack
-Backend/src
  controller
  service
  repository
  entity
  dto
  exception
  security
  EcommerceApplication.java 

-frontend/src
  components
  pages
  services
  assets
  App.js
  index.js


6.API Endpoints 
 GET - /api/products -Get all products 
 GET -/api/products/{id} -Get product by ID 
 POST | /api/products | Create a new product 
 PUT | /api/products/{id} | Update a product 
 DELETE | /api/products/{id} | Delete a product 

# 1. Clone the repository
bash
git clone https://github.com/sujithshetty925-sudo/E-commerce-FullStack.git
cd E-commerce-FullStack

## 2. Set up the database
Create a MySQL database named ecommerce, then configure credentials in:
Backend/src/main/resources/application.properties

### 3. Run the backend
cd Backend
./mvnw spring-boot:run
Runs on http://localhost:8080.
Alternatively, open the Backend folder in IntelliJ IDEA and run EcommerceApplication.java directly.
## 4. Run the frontend
bash
cd frontend
npm install
npm start
Opens automatically at http://localhost:3000.

## Future Improvements
- JWT-based authentication
- Real payment gateway integration
- Order tracking and status updates
- Product reviews and ratings
7. Author
Shetty Sujith
