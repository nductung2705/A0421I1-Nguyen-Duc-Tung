create database hello_mySQL;
use hello_mySQL;
create table Student(
id int,
name varchar(200),
age int,
country varchar(250)
);
select * from Student;
insert into Student values(01,'Duc_Tung',24,'VietNam')