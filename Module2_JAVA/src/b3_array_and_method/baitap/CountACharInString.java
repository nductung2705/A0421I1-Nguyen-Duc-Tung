package b3_array_and_method.baitap;

import java.util.Scanner;

public class CountACharInString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Nhap chuoi: ");
        String inputString=scanner.nextLine();

        System.out.println("Nhap ki tu muon tim kiem: ");
        char characters=scanner.nextLine().charAt(0);

        int count=0;
        for(int i=0;i<inputString.length();i++){
            if(inputString.charAt(i)==characters){
                count++;
            }
        }
        System.out.printf("Ki tu '%c' xuat hien %d lan",characters,count);
    }
}
