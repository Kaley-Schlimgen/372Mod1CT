/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p2m1ct_test;

/**
 *
 * @author kaleyschlimgen
 */
public class Employee {
    //fields (do i need this?)
    String firstName;
    String lastName;
    int employeeID;
    double salary;
    
    //constructor for Employee class that initializes salaryAmount to 0
    public Employee() {
        salary = 0;
    }
    
    //setter methods fro firstName, lastName, and employeeID
    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }
    
    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    public void setEmployeeID(int newEmployeeID) {
        employeeID = newEmployeeID;
    }
    
    //??setter method for salary
    public double setSalary(double newSalary) {
        //salaryAmount = 0;
        salary = newSalary;
//FIXME format 2 decimal places
        return salary;
    }
    
    
    //getter methods for firstName, lastName, and employeeID
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getEmployeeID() {
        return employeeID;
    }
    //public double getSalary() {
    //    return salaryAmount;
    //}

    public void employeeSummary() {
        //System.out.println("EMPLOYEE INFORMATION");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Salary: $" + salary);
        System.out.println("ID: " + employeeID);
    }
    
    //protected String firstName;
    //protected String lastName;
    //protected int employeeID;
    //protected double salary;

    

    
}
