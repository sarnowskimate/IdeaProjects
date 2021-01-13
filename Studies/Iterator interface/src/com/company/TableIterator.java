package com.company;

public class TableIterator implements Iterator {
    final Object[] table;
    final int first;
    final int last;
    int current = -1;

    public TableIterator(Object[] table) {
        this.table = table;
        this.first = 0;
        this.last = table.length - 1;
    }

    @Override
    public void previous() {
        --current;
    }

    @Override
    public void next() {
        ++current;
    }

    @Override
    public void first() {
        current = first;
    }

    @Override
    public void last() {
        current = last;
    }

    @Override
    public boolean isDone() {
        return current < first || current > last;
    }

    @Override
    public Object current() throws IndexOutOfBoundsException {
        return table[current];
    }
}
