package b12_java_collection.thuchanh.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student=new Student("Tung",24,"Lien Chieu");
        Student student1=new Student("Anh",22,"Da Nang");
        Student student2=new Student("Tuan",20,"Hoa Minh");
        Student student3=new Student("Nhi",12,"Gia Lai");

        List<Student> studentList=new ArrayList<Student>();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        Collections.sort(studentList);
        for(Student students : studentList){
            System.out.println(students.toString());
        }
        System.out.println("------Sort theo tuoi-------");
        AgeComparator ageComparator=new AgeComparator();
        Collections.sort(studentList,ageComparator);
        for(Student students : studentList){
            System.out.println(students.toString());
        }
    }
}
