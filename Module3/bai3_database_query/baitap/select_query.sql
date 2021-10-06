use b2_student_managerment;
insert into subjects values(2,'Java','4',1);
insert into class values(10,'SQL','2021-12-12',1);
insert into mark values(9,1,7,7,60);
-- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’
select * from student where StudentName like 'h%';

-- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12.
select * from class where month(StartDate) ='12';

-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
select * from subjects where Credit between 3 and 5;

-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.
update student set ClassID=2 where studentName='Hung';

-- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
select st.StudentName,sj.SubName,m.Mark from student st inner join mark m on st.StudentID=m.StudentID inner join subjects sj on m.SubID=sj.SubID
order by m.Mark,st.StudentName;