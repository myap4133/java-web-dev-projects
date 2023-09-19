package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class DVD extends Disc implements OpticalDisc{
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    private final int minRPM;
    private final int maxRPM;

    public DVD(int minSpeed, int maxSpeed, double storageMax, double storageUsed) {
        super(storageMax, storageUsed);
        minRPM = minSpeed;
        maxRPM = maxSpeed;
    }


    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of " + minRPM + " - " + maxRPM + " rpm.");
    }

    @Override
    public HashMap<String, Double> readData() {
        return null;
    }
}
