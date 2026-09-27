/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.university.lab.sc.assignment.oop;

public class RefactoredBook {
    private String title;
    private String author;
    private boolean isIssued;

    public RefactoredBook(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public String getTitle() { return title; }
    public boolean isIssued() { return isIssued; }

    public boolean issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Success: '" + title + "' has been issued.");
            return true;
        }
        System.out.println("Error: '" + title + "' is already issued.");
        return false;
    }

    public boolean returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Success: '" + title + "' has been returned.");
            return true;
        }
        return false;
    }
}
