package com.company;

public class Wykaz {
    DataList dataList;

    public Wykaz(DataList dataList) {
        this.dataList = dataList;
    }

    @Override
    public String toString() {
        // head
        String s = dataList.title() + "\n";

        // rows
        for (int i = 0; i < dataList.listView().length; i++) {
            s += (i + ".  " + dataList.listView()[i] + "\n");
        }

        // additional info
        s += dataList.additionalInfo() + "\n";
        return s;
    }
}