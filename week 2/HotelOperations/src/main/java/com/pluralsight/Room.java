package com.pluralsight;

public class Room {
    private boolean isClean, isOccupied;
    private int numBeds;

    private float price;

    public Room(boolean isClean, boolean isOccupied, int numBeds, float price) {
        this.isClean = isClean;
        this.isOccupied = isOccupied;
        this.numBeds = numBeds;
        this.price = price;
    }

    public boolean isClean() {
        return isClean;
    }

    public boolean isDirty() {
        return !isClean;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    public int getNumBeds() {
        return numBeds;
    }

    public float getPrice() {
        return price;
    }


}
