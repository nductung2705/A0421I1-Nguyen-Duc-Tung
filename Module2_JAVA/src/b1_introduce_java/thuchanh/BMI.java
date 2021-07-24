package b1_introduce_java.thuchanh;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.printf("Input your weight(Kg): ");
        float weight= scanner.nextFloat();

        System.out.printf("Input your height(Met): ");
        float height= scanner.nextFloat();

        double bmi=weight/(Math.pow(height,2));

        if(bmi<18.5){
            System.out.printf("%f Underweight",bmi);
        }
        else if(bmi<25){
            System.out.printf("%f Normal",bmi);
        }
        else if(bmi<30){
            System.out.printf("%f Overweight",bmi);
        }
        else if(bmi>30){
            System.out.printf("%f Obese",bmi);
        }
    }
}
