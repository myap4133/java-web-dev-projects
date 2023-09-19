package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public abstract class Disc {
    private final double storageCapacity;
    private double storageUsed;
    private double storageLeft;
    private HashMap<String, Double> storageInfo;

    public Disc( double storageMax, double storageUsed){
        storageCapacity = storageMax;
        this.storageUsed = storageUsed;
        storageLeft = storageCapacity - storageUsed;
    }

    public void writeData(String dataName, Double totalStorageRequired) {
        if(totalStorageRequired <= storageLeft){
            addStorageInfo(dataName, totalStorageRequired);
            storageUsed += totalStorageRequired;
            storageLeft -= totalStorageRequired;
            System.out.println("Added " + dataName);
            System.out.println("Have " + storageLeft + " of storage left.");
        }
        else{
            System.out.println("Not enough storage available.");
        }
    }

    public void removeData(String dataName){
        if(storageInfo.containsKey(dataName)){
            storageLeft += storageInfo.get(dataName);
            storageUsed -= storageInfo.get(dataName);
            removeStorageInfo(dataName);
            System.out.println("Removed " + dataName);
            System.out.println("Have " + storageLeft + " of storage left.");
        }
        else{
            System.out.println("Entity does not exist.");
        }
    }

    public void reportInfo(){
        HashMap<String, Double> infoForReport = getStorageInfo();

        System.out.println("Information Currently Stored on Disc:");
        if(infoForReport.isEmpty()){
            System.out.println("No data currently being stored");
        }
        else{
            for(Map.Entry<String, Double> entry : infoForReport.entrySet()){
                System.out.println(entry.getKey() + " |  Size: " + entry.getValue());
            }
        }
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public double getStorageUsed() {
        return storageUsed;
    }

    public void setStorageUsed(double storageUsed) {
        this.storageUsed = storageUsed;
    }

    public void addStorageInfo(String data, Double storage){
        storageInfo.put(data, storage);
    }

    public void removeStorageInfo(String data){
        storageInfo.remove(data);
    }

    public HashMap<String, Double> getStorageInfo() {
        return storageInfo;
    }
}
