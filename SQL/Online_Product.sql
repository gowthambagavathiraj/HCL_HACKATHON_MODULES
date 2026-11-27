create table products(
  product_id int primary key,
  product_name varchar(100) not null,
  category varchar(50),
price decimal(10,2)
);






PROBLEM STATEMENT
An e-commerce company wants to maintain its product catalog. Every product must have a unique product ID, and the product name is mandatory.
The system should store the product ID, product name, category, and price.

TASK
Write a SQL statement to create the products table with:
• product_id as the primary key.
• product_name as NOT NULL.
