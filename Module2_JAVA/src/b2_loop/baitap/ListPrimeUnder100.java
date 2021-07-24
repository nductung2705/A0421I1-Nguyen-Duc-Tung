package b2_loop.baitap;

public class ListPrimeUnder100 {

    public static void main(String[] args) {
        boolean flag=true;
        int orderNumber=0;
        for(int i=2;i<100;i++){
            flag=true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                orderNumber++;
                System.out.printf("\n Số nguyên tố thứ %d: %d",orderNumber,i);
            }
        }
    }
}
