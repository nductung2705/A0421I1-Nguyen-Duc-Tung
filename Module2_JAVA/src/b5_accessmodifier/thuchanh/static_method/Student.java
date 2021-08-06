package b5_accessmodifier.thuchanh.static_method;

public class Student {
    private int rollno;
    private String name;
    private static String college="";

    Student(int rollno, String name){
        this.rollno=rollno;
        this.name=name;
    }
    static void ChangeCollege(){
        college="Codegym";
    }
    public void Display(){
        System.out.printf("rollno: %d \n name: %s, college: %s",this.rollno, this.name,college);
    }
}
