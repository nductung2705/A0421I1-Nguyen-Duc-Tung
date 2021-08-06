package b5_accessmodifier.thuchanh.static_method;

public class Main {
    public static void main(String[] args) {
        Student.ChangeCollege();
        Student newStudent=new Student(999, "Duc Tung");
        newStudent.Display();
    }
}
