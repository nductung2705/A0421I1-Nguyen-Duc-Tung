package b3_array_and_method.thuchanh;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int requestNumber=0;
        System.out.println("Menu: ");
        System.out.println("1, C to F");
        System.out.println("2, F to C");
        System.out.println("0, Exit");
        do {
            System.out.println("\nInput your request: ");
            requestNumber= scanner.nextInt();
            switch (requestNumber) {
                case 1: {
                    System.out.println("Nhap nhiet do: (do C)");
                    System.out.printf("Nhiet do quy doi la: %.2f (do F)", CtoF(scanner.nextDouble()));
                    break;
                }
                case 2: {
                    System.out.println("Nhap nhiet do: (do f)");
                    System.out.printf("Nhiet do quy doi la: %.2f (do C)", FtoC(scanner.nextDouble()));
                    break;
                }
                case 0: {
                    System.exit(0);
                    break;
                }
                default:
                    System.out.printf("Sai gia tri\n");
                    break;
            }
        } while (requestNumber!=0);


        }


    public static double CtoF(double cTemperature){
        double fTemperature= cTemperature*9/5+32;
        return fTemperature;
    }
    public static double FtoC(double fTemperature){
        double cTemperature= (fTemperature-32)*5/9;
        return cTemperature;
    }



}
