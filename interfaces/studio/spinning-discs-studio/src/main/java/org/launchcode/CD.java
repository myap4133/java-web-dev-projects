package org.launchcode;

import java.util.Map;
import java.util.HashMap;

public class CD extends Disc implements OpticalDisc{
    private final int minRPM;
    private final int maxRPM;

    public CD(int minSpeed, int maxSpeed, double storageMax, double storageUsed) {
        super(storageMax, storageUsed);
        minRPM = minSpeed;
        maxRPM = maxSpeed;
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of " + minRPM + " - " + maxRPM + " rpm.");
    }

    @Override
    public HashMap<String, Double> readData() {
        HashMap<String, Double> infoForReport = getStorageInfo();
        if(infoForReport.isEmpty()){
            System.out.println("No data available.");
        }
        return infoForReport;
    }

    public int getMinRPM() {
        return minRPM;
    }

    public int getMaxRPM() {
        return maxRPM;
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
