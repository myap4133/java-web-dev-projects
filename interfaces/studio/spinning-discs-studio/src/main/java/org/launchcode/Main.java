package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD(200, 500, 250, 0);
        DVD dvd = new DVD(570, 1600, 1000, 0);
        // TODO: Call each CD and DVD method to verify that they work as expected.

        cd.spinDisc();
        dvd.spinDisc();

        System.out.println(cd.getMaxRPM());

        /*cd.readData();

        dvd.addStorageInfo("Cat Video", 11.11);

        cd.writeData("Toxic", 13.0);
        cd.writeData("One Piece OP 1", 10.3);
        cd.writeData("Child of the Lamb", 17777.77);*/
    }
}