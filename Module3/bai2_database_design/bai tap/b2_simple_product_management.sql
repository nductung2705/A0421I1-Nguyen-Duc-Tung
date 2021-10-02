create database b2_simple_product_management;
use b2_simple_product_management;


-- Tao bang san pham
create table product(
product_id int primary key auto_increment,
product_name varchar(100) not null,
product_price float default 0
);

-- Tao bang khach hang
create table customer(
customer_id int primary key auto_increment,
customer_name varchar(100) not null,
customer_age int check(customer_age between 1 and 100)
);

-- Tao bang don Dat Hang
create table `order`(
order_id int primary key auto_increment,
customer_id int,
foreign key (customer_id) references customer(customer_id),
order_date date not null,
total_price float not null check(total_price >= 0)
);
-- Tao bang Chi tiet Don Hang
create table order_detail(
order_id int,
foreign key(order_id)  references `order`(order_id),
product_id int,
foreign key(product_id) references product(product_id),
primary key(order_id,product_id),
product_quantity float not null check(product_quantity > 0),
unique (order_id,product_id)
);



