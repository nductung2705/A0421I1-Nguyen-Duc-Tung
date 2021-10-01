-- create database hello_mySQL;
use hello_mySQL;
-- Tao bang Student
create table student(
id varchar(20),
name varchar(200),
age int,
country varchar(250)
)

-- Tao bang Teacher
create table Teacher(
id varchar(20),
name varchar(200),
age int,
country varchar(250)
);
-- Tao bang Class
create table Class(
id int,
name varchar(200)
);

-- Chen du lieu demo
insert into Student values(1,'Duc Tung',24,'Gia Lai');
insert into Teacher values('GV001','Van Hoang',30,'Da Nang');
insert into Class values(100,'A0421I1');

-- Hien Thi du lieuclass

select * from Student;
select * from Teacher;
select * from Class;

