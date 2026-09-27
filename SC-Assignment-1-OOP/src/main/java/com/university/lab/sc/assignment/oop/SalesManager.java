/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.university.lab.sc.assignment.oop;

public class SalesManager extends Employee {
    private double salesCommission;

    public SalesManager(String name, double baseSalary, double salesCommission) {
        super(name, baseSalary);
        this.salesCommission = salesCommission;
    }

    @Override
    public double calculatePay() {
        return baseSalary + salesCommission;
    }
}