package b3_array_and_method.thuchanh;

import java.util.Scanner;

public class FindStudent {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String[] listStudent={"Tung","Tu","Tuan","Anh","Ngoc"};

        System.out.printf("Nhap ten hoc sinh muon tim: ");
        String studentName=scanner.nextLine();

        boolean flag=false;
        for(int i=0;i<listStudent.length;i++){
            if(listStudent[i].equalsIgnoreCase(studentName)){
                System.out.printf("Tim thay hoc sinh %s o vi tri %d",studentName,i);
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.printf("Khong tim thay hoc sinh %s trong lop",studentName);
        }
    }
}
