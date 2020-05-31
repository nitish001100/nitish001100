package com.idenJava.java.executorframework;

import java.util.Scanner;

class Employee extends Thread implements Runnable{
    int empId;
    String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    @Override
    public void run() {

        Employee emp = new Employee(empId, empName);
        System.out.println(emp.toString());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }
}



public class Pract {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int empId;
        String empName;
        System.out.println("Provide Employee ID");
        empId = scanner.nextInt();
        System.out.println("Provide Employee Name");
        empName = scanner.next();

        // By extending Thread.
        Employee employee0 = new Employee(empId, empName);
        employee0.setName("Thread -1 ");
        System.out.println("Name of thread -> " + employee0.getName());
        employee0.start();

        // By implementing Thread.
        Employee employee1 = new Employee(empId, empName);
        Thread thread = new Thread(employee1);
        thread.start();



    }
}
