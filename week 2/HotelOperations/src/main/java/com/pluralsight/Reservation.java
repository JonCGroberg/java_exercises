package com.pluralsight;

public class Reservation {
    private String[] options = {"king", "double"};
    private String roomType;

    private int numNights;
    private float price;
    private boolean isWeekend;

    private float total;

    public Reservation(String roomType, int numNights, float price, boolean isWeekend) {
        this.roomType = roomType;
        this.numNights = numNights;
        this.price = price;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumNights() {
        return numNights;
    }

    public void setNumNights(int numNights) {
        this.numNights = numNights;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setIsWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public float getTotal() {
        return total;
    }

}
