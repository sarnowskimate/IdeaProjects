package com.company;

public class Trip implements DataList {
    String tripPlan;
    Person[] tripParticipants;

    public Trip(String tripPlan, Person[] people) {
        this.tripPlan = tripPlan;
        this.tripParticipants = people;
    }

    @Override
    public String title() {
        return tripPlan;
    }

    @Override
    public String[] listView() {
        String[] list = new String[tripParticipants.length];
        for (int i = 0; i < list.length; i++) {
            list[i] = tripParticipants[i].toString();
        }
        return list;
    }

    @Override
    public String additionalInfo() {
        double paymentSum = 0;
        for (int i = 0; i < tripParticipants.length; i++) {
            paymentSum += tripParticipants[i].getPayment();
        }
        return String.format("Overall cost equals %40.2f", paymentSum);
    }

}
