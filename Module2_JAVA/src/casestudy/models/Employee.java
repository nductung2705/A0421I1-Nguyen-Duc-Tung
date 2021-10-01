package casestudy.models;

import java.util.Date;

public class Employee extends Persons{
    private String employeeID;
    private String level;
    private String position;
    private String salary;

    public Employee(String name, String birthday, String gender, String idCard, String phoneNumber, String email, String employeeID, String level, String position, String salary) {
        super(name, birthday, gender, idCard, phoneNumber, email);
        this.employeeID = employeeID;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
