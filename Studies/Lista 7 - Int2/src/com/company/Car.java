package com.company;

public class Car implements Vehicle {
    private String carId;
    private boolean isCarRegistered;
    private boolean isCarOnParking;

    public Car(String carId) {
        this.carId = carId;
    }

    public void setCarRegistered(boolean carRegistered) {
        isCarRegistered = carRegistered;
    }

    public void setCarOnParking(boolean carOnParking) {
        isCarOnParking = carOnParking;
    }

    @Override
    public String id() {
        return carId;
    }

    @Override
    public boolean isRegistered() {
        return isCarRegistered;
    }

    @Override
    public boolean isOnParking() {
        return isCarOnParking;
    }
}
