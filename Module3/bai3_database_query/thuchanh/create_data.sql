-- create database b2_Student_managerment;
use b2_Student_managerment;


-- Tao bang lop hoc
create table Class(
ClassID int auto_increment primary key,
ClassName varchar(60) not null,
StartDate date not null,
`Status` bit
);
-- Tao bang hoc sinh
create table Student(
StudentID int auto_increment primary key,
StudentName varchar(30) not null,
Address varchar(50),
Phone varchar(30),
`Status` bit,
ClassID int not null,
foreign key (ClassID) references Class(ClassID)
);

-- Tao bang mon hoc
create table Subjects(
SubID int auto_increment primary key,
SubName varchar(30) not null,
Credit tinyint not null default 1 check(Credit>0),
`Status` bit default 1
);

-- Tao bang Diem Thi
create table Mark(
MarkID int primary key auto_increment,
SubID int not null,
StudentID int not null,
Mark float default 0 check (Mark between 0 and 100),
ExamTimes tinyint default 1,
unique(SubID,StudentID),
foreign key(StudentID) references Student(StudentID),
foreign key(SubID) references Subjects(SubID)
);

-- Them du lieu vao bang
select * from class;
insert into class (ClassName,StartDate,`Status`) values('Lop code Mau giao','2021-09-09',1);
insert into class (ClassName,StartDate,`Status`) values('Lop code Thieu nhi','2021-08-06',0);

-- Them nhanh du lieu
select * from Subjects;
insert into Subjects(SubName,Credit,`Status`)
 values('JS',10,1),
		('C',30,0);
-- Them du lieu co Foreign key
select * from student;
insert into Student(StudentName,Address,Phone,`Status`,ClassID) 
values ('Duc Tung','Gia Lai','0328817604',1,1);

insert into Student(StudentName,Address,Phone,`Status`,ClassID) 
values ('Phuong Dong','Quang Ngai','0989714995',1,1);

insert into Student(StudentName,Address,Phone,`Status`,ClassID) 
values ('Van Tu','Da Nang','0989755897',1,1);

insert into Student(StudentName,Address,Phone,`Status`,ClassID) 
values ('Anh Hao','Sai Gon','0989755888',1,2);

select * from Student st inner join class cl on st.Classid=cl.ClassID where cl.ClassID=2;

-- Them du lieu bang subject
select * from mark;
insert into Mark(SubID,StudentID,Mark,ExamTimes) 
values (1,1,9,50),
		(1,2,7,60),
		(1,4,5,90);









