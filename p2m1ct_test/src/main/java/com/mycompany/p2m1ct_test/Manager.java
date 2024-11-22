/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p2m1ct_test;

/**
 *
 * @author kaleyschlimgen
 */
public class Manager extends Employee {
    private String managerDepartment;
    
    public void setDepartment(String newDepartment) {
        managerDepartment = newDepartment;
    }
    
    public String getDeparment() {
        return managerDepartment;
    }
    
    //employeeSummary method taht prints all superclass 
    //and subclass attributes
    @Override
    public void employeeSummary() {

        super.employeeSummary();
        System.out.println("Department: " + managerDepartment);
        
    }
    
    //private String managerDepartment;
    
}

    

