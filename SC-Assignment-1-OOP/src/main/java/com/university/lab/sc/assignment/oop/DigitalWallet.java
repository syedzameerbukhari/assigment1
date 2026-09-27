/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.university.lab.sc.assignment.oop;

public class DigitalWallet {
    private String accountHolder;
    private double balance;
    private String pinCode;

    public DigitalWallet(String accountHolder, double initialBalance, String pinCode) {
        this.accountHolder = accountHolder;
        if (initialBalance < 0) {
            this.balance = 0.0;
        } else {
            this.balance = initialBalance;
        }
        this.pinCode = pinCode;
    }

    public String getAccountHolder() { return accountHolder; }
    public double getBalance() { return balance; }

    public boolean withdraw(double amount, String enteredPin) {
        if (!this.pinCode.equals(enteredPin)) {
            System.out.println("Transaction Failed: Incorrect PIN.");
            return false;
        }
        if (amount <= 0 || amount > this.balance) {
            System.out.println("Transaction Failed: Insufficient funds or invalid amount.");
            return false;
        }
        this.balance -= amount;
        System.out.println("Transaction Successful: $" + amount + " withdrawn.");
        return true;
    }
}