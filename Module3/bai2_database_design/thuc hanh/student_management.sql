create database b2_Student_managerment;
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




