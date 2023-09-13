package org.example;

public abstract class abstractEntity {
    private int id;
    private static int nextId = 1;

    public abstractEntity(){
        id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }
}
