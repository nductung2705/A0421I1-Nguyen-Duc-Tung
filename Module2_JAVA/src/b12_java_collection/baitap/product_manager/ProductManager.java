package b12_java_collection.baitap.product_manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    List<Product> productsList=new ArrayList<Product>();
    public void display(){
        for(Product product : productsList){
            System.out.println(product.toString());
        }
    }
    public void addProduct(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap thong tin san phan");
        System.out.println("ID: ");
        String id=scanner.next();
        System.out.println("Ten: ");
        String name=scanner.next();
        System.out.println("Gia: ");
        float price=scanner.nextFloat();
        productsList.add(new Product(id,name,price));
    }
    public void addProduct(Product product){
        productsList.add(product);
    }
    public void deleteProduct(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap id muon xoa:");
        String id=scanner.next();

        boolean flag=false;
        for(Product product: productsList){
            if(product.getId().equals(id)){
                productsList.remove(product);
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("ID ko ton tai");
        }
    }
    public void editProduct(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap id muon sua:");
        String id=scanner.next();

        int index=-1;
        for(Product product: productsList){
            if(product.getId().equals(id)){
                index=productsList.indexOf(product);
                break;
            }
        }
        if(index==-1){
            System.out.println("ID ko ton tai");
            System.exit(0);
        }
        int choose=-1;
        while (choose!=0){
            System.out.println("1, Sua ten");
            System.out.println("2, Sua gia");
            System.out.println("0, Ket thuc");
            choose=scanner.nextInt();
            switch (choose){
                case 1:{
                    System.out.println("Nhap ten moi:");
                    String newName=scanner.next();
                    productsList.get(index).setName(newName);
                    break;
                }
                case 2:{
                    System.out.println("Nhap gia moi:");
                    float newPrice=scanner.nextFloat();
                    productsList.get(index).setPrice(newPrice);
                    break;
                }
                default:
                    System.out.println("Gia tri nhap ko dung");
                    break;
            }
        }
    }
    public void searchProduct(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap san pham muon tim:");
        String name=scanner.next();

        boolean flag=false;
        for(Product product: productsList){
            if(product.getName().equals(name)){
                System.out.println("Tim thay san pham: ");
                System.out.println(product.toString());
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("San pham ko ton tai");
        }
    }
    public void sortAscending(){
        ComparatorPriceAS comparator=new ComparatorPriceAS();
        Collections.sort(productsList,comparator);

        System.out.println("Danh sach sau khi sap xep tang dan: ");
        display();
    }
    public void sortDescending(){
        ComparatorPriceDECS comparator=new ComparatorPriceDECS();
        Collections.sort(productsList,comparator);

        System.out.println("Danh sach sau khi sap xep giam dan: ");
        display();
    }


}
