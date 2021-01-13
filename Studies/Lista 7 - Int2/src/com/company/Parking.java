package com.company;

public class Parking {
    Database database;

    public void registerVehicle(Vehicle vehicle) {
//        if (isAlreadyRegistered(vehicle)) {
//            return;
//        }
        database.parkingC13.add(vehicle);

    }

    public void registerVehicleEntry(Vehicle vehicle) {
        int i = database.parkingC13.indexOf(vehicle);
        database.parkingC13.
    }

    public void registerVehicleDeparture(Vehicle vehicle) {
        int i = database.parkingC13.indexOf(vehicle);
        database.parkingC13.;
    }

    public boolean isAlreadyRegistered(Vehicle vehicle) {
        //TODO
        return false;
    }










}
