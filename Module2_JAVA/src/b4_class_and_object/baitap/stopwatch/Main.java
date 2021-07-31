package b4_class_and_object.baitap.stopwatch;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Nhap do dai cua mang");
        int length=scanner.nextInt();

        StopWatch countWatch=new StopWatch();
        countWatch.start();
        System.out.println(countWatch.getStarTime());
        int[] numberList=inputArray(length);
        Arrays.sort(numberList);
        countWatch.end();
        System.out.println(countWatch.getEndTime());
        System.out.println(countWatch.getProgressTime());


    }
    public static int[] inputArray(int length){
        int[] array=new int[length];
        for(int i=0;i<length;i++){
            array[i]=(int) (Math.random()*100);
        }
        return array;
    }

}

