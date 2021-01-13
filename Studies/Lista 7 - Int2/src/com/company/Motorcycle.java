package com.company;

public class Motorcycle implements Vehicle {
    private String motorcycleId;
    private boolean isMotorcycleRegistered;
    private boolean isMotorcycleOnParking;

    public Motorcycle(String motorcycleId) {
        this.motorcycleId = motorcycleId;
    }

    public void setMotorcycleRegistered(boolean motorcycleRegistered) {
        isMotorcycleRegistered = motorcycleRegistered;
    }

    public void setMotorcycleOnParking(boolean motorcycleOnParking) {
        isMotorcycleOnParking = motorcycleOnParking;
    }

    @Override
    public String id() {
        return motorcycleId;
    }

    @Override
    public boolean isRegistered() {
        return isMotorcycleRegistered;
    }

    @Override
    public boolean isOnParking() {
        return isMotorcycleOnParking;
    }
}
