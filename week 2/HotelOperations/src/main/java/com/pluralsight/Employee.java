package com.pluralsight;

public class Employee
{
    private float totalPay,regularHours,overtimeHours;

    public Employee(float totalPay, float regularHours, float overtimeHours) {
        this.totalPay = totalPay;
        this.regularHours = regularHours;
        this.overtimeHours = overtimeHours;
    }

    public float getTotalPay() {
        return totalPay;
    }

    public float getRegularHours() {
        return regularHours;
    }

    public float getOvertimeHours() {
        return overtimeHours;
    }
}
