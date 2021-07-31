package b4_class_and_object.baitap.fan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Fan myFan=new Fan("myFan","Red",4);
        myFan.showInfo();
        int choose=0;
        DisplayMenu();
        while (choose!=4){
            choose=scanner.nextInt();
            switch (choose){
                case 1: {
                    myFan.changStatus();
                    myFan.showInfo();
                    break;
                }
                case 2: {
                    myFan.changeSpeed(1);
                    myFan.showInfo();
                    break;
                }
                case 3: {
                    myFan.changeSpeed(-1);
                    myFan.showInfo();
                    break;
                }
            }
        }
        System.exit(0);
    }
    public static void DisplayMenu(){
        System.out.println("\n==============================");
        System.out.println("\nChuc nang cua quat");
        System.out.println("1,Doi trang thai");
        System.out.println("2,Tang toc");
        System.out.println("3,Giam toc");
        System.out.println("4,Exit");
    }

}
