package b1_introduce_java.baitap;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        String result="";
        Scanner scanner=new Scanner(System.in);

        System.out.printf("Nhap con so: \n");
        int number = scanner.nextInt();

        if(number>999||number<0){
            System.out.printf("OverSize");
        }
        else {
            if(number<=12){
                switch (number){
                    case 0:
                        result+="Zero";
                        break;
                    case 1:
                        result+="One";
                        break;
                    case 2:
                        result+="Two";
                        break;
                    case 3:
                        result+="Three";
                        break;
                    case 4:
                        result+="Four";
                        break;
                    case 5:
                        result+="Five";
                        break;
                    case 6:
                        result+="Six";
                        break;
                    case 7:
                        result+="Seven";
                        break;
                    case 8:
                        result+="Eight";
                        break;
                    case 9:
                        result+="Nine";
                        break;
                    case 10:
                        result+="Ten";
                        break;
                    case 11:
                        result+="Eleven";
                        break;
                    case 12:
                        result+="Twelve";
                        break;
                }

            }
            else if(number<20){
                int ones=number%10;
                switch (ones){
                    case 3:
                        result+="Thir";
                        break;
                    case 4:
                        result+="Four";
                        break;
                    case 5:
                        result+="Fif";
                        break;
                    case 6:
                        result="six";
                        break;
                    case 7:
                        result="seven";
                        break;
                    case 8:
                        result="eight";
                        break;
                    case 9:
                        result="nine";
                        break;
                }
                result+="teen";

            }
            else if(number<100){
                int tens= number/10;
                int ones=number%10;
                switch (tens){
                    case 2:
                        result+="Twenty";
                        break;
                    case 3:
                        result+="Thirty";
                        break;
                    case 4:
                        result+="Forty";
                        break;
                    case 5:
                        result+="Fifty";
                        break;
                    case 6:
                        result+="Sixty";
                        break;
                    case 7:
                        result+="Seventy";
                        break;
                    case 8:
                        result+="Eighty";
                        break;
                    case 9:
                        result+="Ninety";
                        break;
                }
                switch (ones){
                    case 1:
                        result+=" One";
                        break;
                    case 2:
                        result+=" Two";
                        break;
                    case 3:
                        result+=" Three";
                        break;
                    case 4:
                        result+=" Four";
                        break;
                    case 5:
                        result+=" Five";
                        break;
                    case 6:
                        result+=" Six";
                        break;
                    case 7:
                        result+=" Seven";
                        break;
                    case 8:
                        result+=" Eight";
                        break;
                    case 9:
                        result+=" Nine";
                        break;
                }
            }
            else if(number<=999){
                int hundreds=number/100;
                int ones=number%10;
                switch (hundreds){
                    case 1:
                        result+="One hundred";
                        break;
                    case 2:
                        result+="Two hundred";
                        break;
                    case 3:
                        result+="Three hundred";
                        break;
                    case 4:
                        result+="Four hundred";
                        break;
                    case 5:
                        result+="Five hundred";
                        break;
                    case 6:
                        result+="Six hundred";
                        break;
                    case 7:
                        result+="Seven hundred";
                        break;
                    case 8:
                        result+="Eight hundred";
                        break;
                    case 9:
                        result+="Nine hundred";
                        break;
                }
                int tens=(number%100)/10;
                if(tens>0){
                    result+=" and ";
                switch (tens){
                    case 1:
                        switch (ones){
                            case 1: result="Eleven";
                            case 2: result="Twelve";
                            case 3:
                                result+="Thirteen";
                                break;
                            case 4:
                                result+="Fourteen";
                                break;
                            case 5:
                                result+="Fifteen";
                                break;
                            case 6:
                                result="sixteen";
                                break;
                            case 7:
                                result="seventeen";
                                break;
                            case 8:
                                result="eightteen";
                                break;
                            case 9:
                                result="nineteen";
                                break;
                        }
                        break;
                    case 2:
                        result+="Twenty";
                        break;
                    case 3:
                        result+="Thirty";
                        break;
                    case 4:
                        result+="Forty";
                        break;
                    case 5:
                        result+="Fifty";
                        break;
                    case 6:
                        result+="Sixty";
                        break;
                    case 7:
                        result+="Seventy";
                        break;
                    case 8:
                        result+="Eighty";
                        break;
                    case 9:
                        result+="Ninety";
                        break;
                }
                }
                switch (ones){
                    case 1:
                        result+=" One";
                        break;
                    case 2:
                        result+=" Two";
                        break;
                    case 3:
                        result+=" Three";
                        break;
                    case 4:
                        result+=" Four";
                        break;
                    case 5:
                        result+=" Five";
                        break;
                    case 6:
                        result+=" Six";
                        break;
                    case 7:
                        result+=" Seven";
                        break;
                    case 8:
                        result+=" Eight";
                        break;
                    case 9:
                        result+=" Nine";
                        break;
                }

            }
        }
        System.out.printf(result);

    }
}
