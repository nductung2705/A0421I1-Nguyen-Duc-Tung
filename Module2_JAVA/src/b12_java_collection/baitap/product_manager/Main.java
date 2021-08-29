package b12_java_collection.baitap.product_manager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ProductManager myProductManager = new ProductManager();

        myProductManager.addProduct(new Product("1", "Gao", 200000));
        myProductManager.addProduct(new Product("2", "Duong", 30000));
        myProductManager.addProduct(new Product("3", "Muoi", 15000));

        myProductManager.display();
        int myChoose = -1;
        while (myChoose != 0) {
            showMenu();
            System.out.println("Chon chuc nang: ");
            myChoose=scanner.nextInt();
            switch (myChoose){
                case 1:{
                    myProductManager.addProduct();
                    break;
                }
                case 2:{
                    myProductManager.editProduct();
                    break;
                }
                case 3:{
                    myProductManager.deleteProduct();
                    break;
                }
                case 4:{
                    myProductManager.sortAscending();
                    break;
                }
                case 5:{
                    myProductManager.sortDescending();
                    break;
                }
                case 6:{
                    myProductManager.searchProduct();
                    break;
                }
                case 7:{
                    myProductManager.display();
                    break;
                }
                case 0: break;
                default:{
                    System.out.println("Lua chon ko hop le");
                    break;
                }
            }
        }
    }

    public static void showMenu() {
        System.out.println("1, Them san pham");
        System.out.println("2, Sua san pham");
        System.out.println("3, Xoa san pham");
        System.out.println("4, Sap xep tang dan");
        System.out.println("5, Sap xep giam dan");
        System.out.println("6, Tim kiem");
        System.out.println("7, Xem danh sach");
        System.out.println("0, Thoat");
    }
}
