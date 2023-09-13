package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer("16.1", "Mark Twain", "64 GB");
        Laptop laptop = new Laptop("15.6", "Paul Dawson", "64 GB", 90);
        SmartPhone smartPhone = new SmartPhone("12.4", "Percy Jackson", "64 GB", "verizon");

        computer.displayComputerProperties();
        laptop.displayBattery();
        smartPhone.displayProvider();
    }
}