/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.university.lab.sc.assignment.oop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== TASK 1: DIGITAL WALLET ===");
        DigitalWallet wallet = new DigitalWallet("Ali Khan", 500.0, "1234");
        wallet.withdraw(100.0, "0000"); // Wrong PIN
        wallet.withdraw(200.0, "1234"); // Correct PIN
        System.out.println("Current Balance: $" + wallet.getBalance());

        System.out.println("\n=== TASK 2: EMPLOYEE POLYMORPHISM ===");
        List<Employee> employees = new ArrayList<>();
        employees.add(new Developer("Sara", 80000, 15000));
        employees.add(new SalesManager("Usman", 60000, 25000));

        for (Employee emp : employees) {
            System.out.println(emp.getName() + " Calculated Pay: $" + emp.calculatePay());
        }

        System.out.println("\n=== TASK 3: SMART DEVICE CONTRACT ===");
        SmartDevice bulb = new SmartBulb();
        SmartDevice thermostat = new SmartThermostat();
        bulb.turnOn();
        thermostat.turnOn();
        System.out.println(bulb.getStatus());
        System.out.println(thermostat.getStatus());

        System.out.println("\n=== TASK 4: REFACTORED AI BOOK CLASS ===");
        RefactoredBook book = new RefactoredBook("Software Engineering", "Ian Sommerville");
        book.issueBook();
        book.issueBook();
        book.returnBook();
    }
}
