package com.company;

public class BubbleSort {
    private Comparator comparator;

    public BubbleSort(Comparator comparator) {
        setComparator(comparator);
    }

    public void setComparator(Comparator comparator) {
        this.comparator = comparator;
    }
}
