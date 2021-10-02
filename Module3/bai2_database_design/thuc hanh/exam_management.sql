create database Exam_managerment;
use Exam_managerment;

-- Tao bang hoc sinh
create table Student(
student_id varchar(20),
student_name varchar(200),
student_birthday date,
student_class varchar(200),
student_gender boolean
);
-- Tao bang mon hoc
create table Subjects(
subjects_id varchar(20),
subjects_name varchar(200)
);

-- Tao bang Bang Diem
create table Exam(
student_id varchar(20),
subjects_id varchar(20),
exam_date date,
result float,
primary key(student_id,subjects_id),
foreign key (student_id) references Student(student_id)
);
-- Tao bang giao vien
create table Teacher(
teacher_id varchar(20),
teacher_name varchar(200),
phone varchar(20)
);

alter table Student add constraint myPK primary key(student_id);

alter table Teacher add constraint myPK primary key(teacher_id);

alter table subjects add constraint myPK primary key(subjects_id);

alter table Subjects add teacher_id varchar(20);

alter table Subjects add constraint FK_maGV foreign key (teacher_id) references Teacher(teacher_id);

alter table Exam add constraint FK_maMH foreign key (subjects_id) references Subjects(subjects_id);


