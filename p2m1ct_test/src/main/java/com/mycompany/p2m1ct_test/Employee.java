/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p2m1ct_test;

/**
 *
 * @author kaleyschlimgen
 * 
 * The Employee class is the superclass. 
 * This class contains setters and getters for the fields associated
 * with the employees' information. 
 * 
 * The employeeSummary method prints the name, salary, and ID of the employees.
 * 
 */

public class Employee {
    //fields
    String firstName;
    String lastName;
    int employeeID;
    double salary;
    
    //constructor for Employee class that initializes salaryAmount to 0
    public Employee() {
        salary = 0;
    }
    
    //setter methods for firstName, lastName, and employeeID
    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }
    
    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    public void setEmployeeID(int newEmployeeID) {
        employeeID = newEmployeeID;
    }
  
    //setter method for salary
    public double setSalary(double newSalary) {
        salary = newSalary;
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

    public void employeeSummary() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.print("Salary: $");
        System.out.printf("%.2f\n", salary);
        System.out.println("ID: " + employeeID);
    }
     
}
