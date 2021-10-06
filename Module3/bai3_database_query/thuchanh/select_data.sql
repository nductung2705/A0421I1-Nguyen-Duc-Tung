use b2_student_managerment;

-- Hiển thị danh sách tất cả các hoc viên

select * from student;
-- Hiển thị danh sách các học viên đang theo học.
 select * from student where `status`=1;
-- Hiển thị danh sách các môn học có thời gian học nhỏ hơn 10 giờ.

Select * from subjects where Credit>10;
-- Hiển thị danh sách học viên lớp A1
select st.StudentName,cl.ClassName from student st inner join class cl on st.ClassID=cl.ClassID
where cl.ClassName='Lop code Mau giao';

-- Hiển thị điểm môn CF của các học viên.
select st.StudentName,sj.SubName, m.mark from student st inner join mark m on st.StudentID=m.StudentID inner join subjects sj on m.SubID=sj.SubID
where sj.SubName='Pascal';
