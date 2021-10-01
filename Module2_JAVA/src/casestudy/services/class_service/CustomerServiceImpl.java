package casestudy.services.class_service;

import casestudy.models.Customers;
import casestudy.models.Persons;
import casestudy.services.CustomerService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    public static List<Customers> customersList=new ArrayList<Customers>();
    public static Scanner scanner=new Scanner(System.in);

    @Override
    public void display() {
        if(customersList.size()==0){
            System.out.println("Chua co KH nao ca");
        }
        else {
            for(Customers man: customersList){
                System.out.println(man.toString());
            }
        }
    }

    @Override
    public void addNew() {
        System.out.println("---------Them moi khach hang--------");
        System.out.println("Nhap ten khach hang");
        String name=scanner.nextLine();
        System.out.println("Nhap ma khach hang");
        String code=scanner.nextLine();
        System.out.println("Nhap gioi tinh");
        String gender=scanner.nextLine();
        System.out.println("Nhap ngay sinh khach hang");
        String birthDay=scanner.nextLine();
        System.out.println("Nhap CMND");
        String idCard=scanner.nextLine();
        System.out.println("Nhap SDT");
        String phone=scanner.nextLine();
        System.out.println("Nhap Email");
        String email=scanner.nextLine();
        System.out.println("Nhap loai KH");
        String customersType=scanner.nextLine();
        System.out.println("Nhap dia chi");
        String address=scanner.nextLine();

        for(Customers customers:customersList){
            if(customers.getIdCard().equals(idCard)){
                System.out.println("KH da ton tai");
                break;
            }
            else {
                Customers newCustomer=new Customers(name,birthDay,gender,idCard,phone,email,code,customersType,address);
                customersList.add(newCustomer);
            }
        }

    }

    @Override
    public void edit() {
        System.out.println("Sua thong tin khach hang");
        System.out.println("Nhap ten khach hang");
        String nameTemp=scanner.nextLine();
        boolean isHaveInfo=false;
        for(Customers customers:customersList){
            if(customers.getName().equals(nameTemp)){
                System.out.println("---------Nhap thong tin muon sua--------");
                System.out.println("Nhap ten khach hang");
                String name=scanner.nextLine();;
                System.out.println("Nhap SDT");
                String phone=scanner.nextLine();
                System.out.println("Nhap Email");
                String email=scanner.nextLine();
                System.out.println("Nhap dia chi");
                String address=scanner.nextLine();
                customers.setName(name);
                customers.setPhoneNumber(phone);
                customers.setEmail(email);
                customers.setAddress(address);
                isHaveInfo=true;
            }
        }
        if (isHaveInfo==false){
            System.out.println("Khong co khach hang can tim kiem");
        }
    }

    @Override
    public void delete() {

    }
}
