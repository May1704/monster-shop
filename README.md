# 🛒 Monster Shop - Backend

Este proyecto es el backend de una tienda online llamada **Monster Shop**, 
desarrollado en Java 21 con Spring Boot y MySQL. Proporciona una API REST para 
gestionar productos y reseñas, y conectarse con un frontend hecho en React (en proceso).

---

## 📦 Tecnologías

- Java 21
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

---

## 🚀 Cómo ejecutar el proyecto

### 1. Crear el repositorio
https://github.com/May1704/monster-shop

### 2. Configura la base de datos 
   Asegúrate de tener MySQL instalado y crea una base de datos llamada shop.

### 3. Configura application.properties
Ubicado en src/main/resources/application.properties, edita los datos de tu conexión:

spring.application.name=shop
spring.datasource.url=jdbc:mysql://localhost:3306/shop
spring.datasource.username=user
spring.datasource.password=contraseña
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.show-sql=true

### 4. Ejecuta la aplicación
Desde IntelliJ o con:

spring-boot:run

La API se iniciará en:

http://localhost:8080

### 🧪 Pruebas con Postman
📍 Productos
GET /api/products – Lista todos los productos
GET /api/products/{productId} – Muestra los detalles de un producto
POST /api/products – Crea un nuevo producto
PUT /api/products/{id} – Actualiza un producto
DELETE /api/products/{id} – Elimina un producto

⭐ Reseñas
GET /api/reviews/{productId} – Muestra las reseñas de un producto
POST /api/reviews – Crea una reseña para un producto