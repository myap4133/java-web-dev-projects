package org.example;

public class Laptop extends Computer{
    private int batteryLife;

    public Laptop(String anIOS, String anOwner, String ram, int battery){
        super(anIOS, anOwner, ram);
        batteryLife = battery;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public void displayBattery(){
        System.out.println("Battery Currently at " + batteryLife + "%");
    }
}
