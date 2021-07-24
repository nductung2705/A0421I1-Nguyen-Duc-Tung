package b1_introduce_java.baitap;

import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.printf("Press your name: ");
        String name= scanner.next();

            System.out.printf("Hello %s", name);
    }
}

