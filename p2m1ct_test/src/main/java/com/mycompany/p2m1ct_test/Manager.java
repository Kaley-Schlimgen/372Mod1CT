/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p2m1ct_test;

/**
 *
 * @author kaleyschlimgen
 * 
 * The Manager class is the subclass of the Employee superclass.
 * 
 * This class only adds a setter and getter method for the 
 * added field: managerDepartment.
 * 
 * The manager class also has an employeeSummary() method, 
 * which prints the lines 
 * from the Employee class' employeeSummary method 
 * via the line super.employeeSummary, 
 * and it adds the managerDepartment information 
 * to the output as well.
 * The @Override above the employeeSummary method enables
 * the Manger to print the information from the Employee method
 * without having to re-write all of that code.
 * 
 */

public class Manager extends Employee {
    private String managerDepartment;
    
    public void setDepartment(String newDepartment) {
        managerDepartment = newDepartment;
    }
    
    public String getDeparment() {
        return managerDepartment;
    }
    
    /*employeeSummary method that prints 
    all superclass and subclass attributes*/
    @Override
    public void employeeSummary() {

        super.employeeSummary();
        System.out.println("Department: " + managerDepartment);
        
    }
    
}

    

