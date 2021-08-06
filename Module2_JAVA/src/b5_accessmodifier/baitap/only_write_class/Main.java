package b5_accessmodifier.baitap.only_write_class;

public class Main {
    public static void main(String[] args) {
        OnlyWriteClass newClass= new OnlyWriteClass();
        newClass.setClass("A04") ;
        newClass.setName("Tung") ;
        System.out.printf("Class: %s \n Name: %s", newClass.getClasses(),newClass.getName());
    }

}
