package com.durgasoft.beans;

public class Employee {
    private String employee_Id;
    private String employee_Name;
    private int employee_Age;
    private String employee_Email;
    private String employee_Mobile;

    public String getEmployee_Id() {
        return employee_Id;
    }

    public void setEmployee_Id(String employee_Id) {
        this.employee_Id = employee_Id;
    }

    public String getEmployee_Name() {
        return employee_Name;
    }

    public void setEmployee_Name(String employee_Name) {
        this.employee_Name = employee_Name;
    }

    public int getEmployee_Age() {
        return employee_Age;
    }

    public void setEmployee_Age(int employee_Age) {
        this.employee_Age = employee_Age;
    }

    public String getEmployee_Email() {
        return employee_Email;
    }

    public void setEmployee_Email(String employee_Email) {
        this.employee_Email = employee_Email;
    }

    public String getEmployee_Mobile() {
        return employee_Mobile;
    }

    public void setEmployee_mobile(String employee_mobile) {
        this.employee_Mobile = employee_mobile;
    }
    public void getEmployeeDetails(){
        System.out.println("Employee Details");
        System.out.println("-----------------------");
        System.out.println("Employee Id            : "+employee_Id);
        System.out.println("Employee Name          : "+employee_Name);
        System.out.println("Employee Age           : "+employee_Age);
        System.out.println("Employee Email         : "+employee_Email);
        System.out.println("Employee Mobile Number : "+employee_Mobile);
    }
}
