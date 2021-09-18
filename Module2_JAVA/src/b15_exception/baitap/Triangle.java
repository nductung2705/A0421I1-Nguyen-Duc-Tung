package b15_exception.baitap;

import java.text.ParseException;
import java.util.Scanner;

public class Triangle {
    private float sideA=0;
    private float sideB=0;
    private float sideC=0;

    public Triangle(){

    }
    public  Triangle(float sideA, float sideB, float sideC) throws TriangleException{
        //try{
            if(sideA<=0||sideB<=0||sideC<=0){
                throw new TriangleException("Do dai cac canh phai lon hon 0");

            }
            else if(sideA+sideB<=sideC||sideA+sideC<=sideB||sideB+sideC<=sideA){
                throw new TriangleException("Tong 2 canh phai lon hon canh con lai");
            }
            else {
                this.sideA=sideA;
                this.sideB=sideB;
                this.sideC=sideC;
            }
        //} catch (Exception e){
            //throw new TriangleException("Sai ra ngoai le khac");
        //}
    }
    public String toString(){
        return "Tam giac: "+sideA+ "," +sideB+"," +sideC;
    }

}
