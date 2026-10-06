/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package macedaemployeepayroll;

/**
 *
 * @author User
 */

   

public abstract class Employee {

    private String employeeID;
    private String name;
    private String department;

    private static int employeeCount = 0;

    // Default constructor
    public Employee() {
        employeeCount++;
    }

    // Parameterized constructor
    public Employee(String employeeId, String name, String department) {
        this.employeeID = employeeId;
        this.name = name;
        this.department = department;
        employeeCount++;
    }

    // Getters and Setters
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Regular method
    public void displayEmployeeInfo() {
        System.out.println("Employee ID\t: " + employeeID);
        System.out.println("Name\t\t: " + name);
        System.out.println("Department\t: " + department);
    }

    // Method overloading
    public void displayEmployeeInfo(boolean showSalary) {
        displayEmployeeInfo();

        if (showSalary) {
            System.out.printf("Salary\t\t: PHP %,.2f%n", calculateSalary());
        }
    }

    // Static method
    public static int getEmployeeCount() {
        return employeeCount;
    }
}



