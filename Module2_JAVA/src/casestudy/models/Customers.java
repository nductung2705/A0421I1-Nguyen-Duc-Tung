package casestudy.models;

import java.util.Date;

public class Customers extends Persons{
    private String customerID;
    private String customerType;
    private String address;
    public Customers(String name, String birthday, String gender, String idCard, String phoneNumber, String email, String customerID, String customerType, String address) {
        super(name, birthday, gender, idCard, phoneNumber, email);
        this.customerID = customerID;
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getCustomerType() {
        return customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Tui la Khach VIP, Ten:"+this.getName()
                +"CMND:"+this.getIdCard()
                +"SDT"+this.getPhoneNumber();
    }
}
