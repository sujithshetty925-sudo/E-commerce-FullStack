1.E-Commerce Full Stack Application
A full-stack e-commerce web application built with a *React* frontend and a *Spring Boot* REST API backend, backed by *MySQL*. It provides a complete shopping experience — browsing products, managing a cart, placing orders, user login, and an admin-side product management flow.

2.Overview
This project combines two parts into a single deployable application:
Frontend — a modern, responsive React interface for browsing products, searching, viewing product details, managing the cart, checking out, and viewing order history/profile.
Backend— a Spring Boot REST API that handles product, category, cart, order, and user data, backed by MySQL.

3.Features
 Home page with product listing and search
 <br>
 Product details page
  <br>
 Add to Cart / Buy Now
  <br>
 Checkout page with demo payment flow
  <br>
 Order success page and order history ("My Orders")
  <br>
 User login/signup and profile page
  <br>
 Admin-side product management (add, update, delete, view products and categories)
  <br>
 Responsive navigation bar and footer, mobile-friendly UI
  <br>
4.Tech Stack
 <br>
Frontend
 <br>
 React.js
  <br>
 JavaScript 
  <br>
 HTML5, CSS3
  <br>
 Axios (API calls)
  <br>
 React Router DOM
  <br>

Backend 
 Java 17
  <br>
 Spring Boot
  <br>
 Spring Data JPA / Hibernate
  <br>
 MySQL
  <br>
 RESTful API architecture
  <br>

5.Project Structure
 <br>
E-commerce-FullStack
 <br>
-Backend/src
 <br>
  controller
   <br>
  service
   <br>
  repository
   <br>
  entity
   <br>
  dto
   <br>
  exception
   <br>
  security
   <br>
  EcommerceApplication.java 
   <br>

-frontend/src
 <br>
  components
   <br>
  pages
   <br>
  services
   <br>
  assets
   <br>
  App.js
   <br>
  index.js
   <br>

6.API Endpoints 
 GET - /api/products -Get all products 
 <br>
 GET -/api/products/{id} -Get product by ID 
 <br>
 POST | /api/products | Create a new product 
 <br>
 PUT | /api/products/{id} | Update a product 
 <br>
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
