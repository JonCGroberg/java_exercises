package com.pluralsight;

public class CellPhone {
    private String serialNum, model, carrier, phoneNum, owner;

    public CellPhone() {
        this.serialNum = "0";
        this.model = "";
        this.carrier = "";
        this.phoneNum = "";
        this.owner = "";
    }

    public CellPhone(String serialNum, String model, String carrier, String phoneNum, String owner) {
        this.serialNum = serialNum;
        this.model = model;
        this.carrier = carrier;
        this.phoneNum = phoneNum;
        this.owner = owner;
    }

    public String toString (){
        return String.format("Serial Number: %s\nModel: %s\nCarrier: %s\nPhone Number: %s\nOwner: %s",serialNum,model,carrier,phoneNum,owner);
    }

    public String getCarrier() {
        return carrier;
    }

    public String getModel() {
        return model;
    }

    public String getOwner() {
        return owner;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }
}
