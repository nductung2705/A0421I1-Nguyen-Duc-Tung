package b2_loop.thuchanh;

import java.util.Scanner;

public class DrawMenu {
    public static void main(String[] args) {
        DisplayDefault();
        Scanner scanner= new Scanner(System.in);
            System.out.println("Input your choice: \n");
            int choiceNumber = scanner.nextInt();

            while (choiceNumber!=0){
                Draw(choiceNumber);
                System.out.println("Input your choice: \n");
                choiceNumber = scanner.nextInt();
                }
    }
    public static void DisplayDefault(){
        System.out.printf("Menu: \n");
        System.out.printf("1. Draw a triangle \n");
        System.out.printf("2. Draw a square \n");
        System.out.printf("3. Draw a rectangle \n");
    }

    public static void Draw(int choice) {
            switch (choice){
                case 1:
                    System.out.println("Draw the triangle");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
            }
        }


