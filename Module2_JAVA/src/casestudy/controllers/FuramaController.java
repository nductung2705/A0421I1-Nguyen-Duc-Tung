package casestudy.controllers;

import java.util.Scanner;

public class FuramaController {
    Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        boolean isExit = false;
        while (isExit == false) {
            System.out.println("1.Employee Management");
            System.out.println("2.Customers Management");
            System.out.println("3.Facility Management");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");
            try {
                int choose = scanner.nextInt();
                switch (choose) {
                    case 1: {
                        employeeMenu();
                        break;
                    }
                    case 2: {
                        customerMenu();
                        break;
                    }
                    case 3:{
                        facilityMenu();
                        break;
                    }
                    case 4:{
                        bookingMenu();
                        break;
                    }
                    case 5:{
                        promotionMenu();
                        break;
                    }
                    case 6: {
                        isExit = true;
                        System.exit(0);
                    }
                    default:{
                        System.out.println("Gia tri vua nhap ko dung");
                    }
                }
            } catch (Exception e) {
                System.err.println("Gia tri vua nhap ko hop le");
            }
        }
    }

    public void employeeMenu() {
        try {
            int choose = scanner.nextInt();
            while (choose != 4) {
                System.out.println("----Employee Menu----");
                System.out.println("1. Display list employee");
                System.out.println("2. Add new employee");
                System.out.println("3. Edit employee");
                System.out.println("4. Return main menu");
                switch (choose) {
                    case 4: {
                        displayMainMenu();
                        break;
                    }
                }

            }
        }
         catch(Exception e)
        {
            System.err.println("Gia tri vua nhap ko hop le");
        }

    }

    public void customerMenu() {
        try {
            int choose = scanner.nextInt();
            while (choose != 4) {
                System.out.println("----Customers Menu----");
                System.out.println("1. Display list customers");
                System.out.println("2. Add new customers");
                System.out.println("3. Edit customers");
                System.out.println("4. Return main menu");
                switch (choose) {
                    case 4:
                        displayMainMenu();
                        break;
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Gia tri vua nhap ko hop le");
        }
    }
    public void facilityMenu() {
        try {
            int choose = scanner.nextInt();
            while (choose != 4) {
                System.out.println("----Facility Menu----");
                System.out.println("1. Display list facility");
                System.out.println("2. Add new facility");
                System.out.println("3. Edit facility");
                System.out.println("4. Return main menu");
                switch (choose) {
                    case 4:
                        displayMainMenu();
                        break;
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Gia tri vua nhap ko hop le");
        }
    }
    public void bookingMenu() {
        try {
            int choose = scanner.nextInt();
            while (choose != 6) {
                System.out.println("----Booking Menu----");
                System.out.println("1. Add new booking");
                System.out.println("2. Display list booking");
                System.out.println("3. Create new constracts");
                System.out.println("4. Display list contracts");
                System.out.println("5. Edit contracts");
                System.out.println("6. Return main menu");
                switch (choose) {
                    case 6:
                        displayMainMenu();
                        break;
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Gia tri vua nhap ko hop le");
        }
    }
    public void promotionMenu() {
        try {
            int choose = scanner.nextInt();
            while (choose != 3) {
                System.out.println("----Promotion Menu----");
                System.out.println("1. Display list customers use service");
                System.out.println("2. Display list customers get voucher");
                System.out.println("3. Return main menu");
                switch (choose) {
                    case 3:
                        displayMainMenu();
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Gia tri vua nhap ko hop le");
        }
    }

}
