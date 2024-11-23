/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p2m1ct_test;

/**
 *
 * @author kaleyschlimgen
 * 
 * The P2m1ct_test class is the program's main class. 
 * It tests that the Employee and Manager classes perform as desired.
 * 
 * It also is a central location for assigning specific values to the
 * other classes' fields.
 * 
 */

public class P2m1ct_test {
    public static void main(String[] args) {
        Employee employeeItem = new Employee();
        Manager managerItem = new Manager();
        
        System.out.println("EMPLOYEE INFORMATION");
        //sets Employee attributes
        employeeItem.setFirstName("John");
        employeeItem.setLastName("Smith");
        employeeItem.setSalary(35000);
        employeeItem.setEmployeeID(555);
        employeeItem.employeeSummary();
        
        System.out.println();
        
        System.out.println("MANAGER INFORMATION");
        //sets Manager attributes
        managerItem.setFirstName("Sue");
        managerItem.setLastName("Sanderson");
        managerItem.setSalary(70000);
        managerItem.setEmployeeID(111);
        managerItem.setDepartment("Sales");
        managerItem.employeeSummary();
   
    }
    
}


    

