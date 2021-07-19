package b2_loop.thuchanh;

import java.util.Scanner;

public class TotalMoney {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.printf("Nhap so tien muon gui: ");
        float preMoney= scanner.nextFloat();

        System.out.printf("\n Nhap so thang:");
        int month=scanner.nextInt();

        System.out.printf("Nhap lai suat 1 nam: ");
        float percent= scanner.nextFloat();

        if(preMoney <= 0 || month <= 0 ||percent <= 0){
            System.out.printf("Thong tin sai");
        }
        else {
            float subMoney=preMoney*(percent/100/12)*month;

            float totalMoney=preMoney+subMoney;

            System.out.printf("\n So tien lai la: %.2f",subMoney);
            System.out.printf("\n Tong tien sau khi rut la: %.2f",totalMoney);
        }
    }
}
