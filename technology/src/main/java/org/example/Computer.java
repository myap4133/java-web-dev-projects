package org.example;

public class Computer extends abstractEntity{
    private String iOS;
    private String owner;
    private String RAM_Size;

    public Computer(String anIOS, String anOwner, String ram){
        super();
        iOS = anIOS;
        owner = anOwner;
        RAM_Size = ram;
    }

    public String getiOS() {
        return iOS;
    }

    public void setiOS(String iOS) {
        this.iOS = iOS;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getRAM_Size() {
        return RAM_Size;
    }

    public void setRAM_Size(String RAM_Size) {
        this.RAM_Size = RAM_Size;
    }

    public void displayComputerProperties(){
        System.out.println("Current iOS: " + iOS + "\nRAM Size: " + RAM_Size);
    }
    public void displayUser(){
        System.out.println("Current User: " + owner);
    }
}
