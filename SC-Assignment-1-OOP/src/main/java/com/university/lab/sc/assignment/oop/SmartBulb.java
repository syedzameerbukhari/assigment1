/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.university.lab.sc.assignment.oop;

public class SmartBulb implements SmartDevice {
    private boolean isOn = false;
    private int brightness = 100;

    @Override public void turnOn() { isOn = true; }
    @Override public void turnOff() { isOn = false; }
    @Override
    public String getStatus() {
        return "SmartBulb Status: " + (isOn ? "ON" : "OFF") + " | Brightness: " + brightness + "%";
    }
    public void setBrightness(int level) { this.brightness = level; }
}