create database product;
use product;


-- Tao bang vat tu 
create table product(
product_code int primary key auto_increment,
product_name varchar(100)
);

-- Tao bang phieu xuat
create table export_bill(
export_code int primary key auto_increment,
export_date date
);

-- Tao bang chi tiet phieu xuat
create table export_detail(
export_detail_id int primary key auto_increment,
export_code int,
foreign key(export_code) references export_bill (export_code),
product_code int,
foreign key(product_code) references product (product_code),
export_cost float not null check(export_cost > 0),
export_quantity float not null check(export_quantity > 0),
unique(export_code,product_code)
);
-- Tao bang phieu nhap
create table import_bill(
import_code int primary key auto_increment,
import_date date
);

-- Tao bang chi tiet phieu nhap
create table import_detail(
import_detail_id int primary key auto_increment,
import_code int,
foreign key(import_code) references import_bill (import_code),
product_code int,
foreign key(product_code) references product (product_code),
import_cost float not null check(import_cost > 0),
import_quantity float not null check(import_quantity > 0),
unique(import_code,product_code)
);

-- Tao bang nha cung cap
create table partners(
partners_code int primary key auto_increment,
partners_name varchar(100) not null,
partners_address varchar(100),
partners_phoneNumber varchar(15),
unique(partners_name,partners_phoneNumber)
);

-- Tao bang don Dat Hang
create table the_order(
order_code int primary key auto_increment,
order_date date,
partners_code int,
foreign key (partners_code) references partners(partners_code)
);
-- Tao bang Chi tiet Don Hang
create table order_detail(
order_detail_id int primary key auto_increment,
order_code int,
product_quantity float not null check(product_quantity > 0),
product_code int,
foreign key(order_code) references the_order (order_code),
foreign key(product_code) references product (product_code),
unique (product_code,order_code)
);



