package com.company;

public class FilteringIterator implements Iterator {
    private final Iterator iterF;
    private final Predicate pred;

    public FilteringIterator(Iterator iterF, Predicate pred) {
        this.iterF = iterF;
        this.pred = pred;
    }

    public void filterForward() {
        while (!iterF.isDone() && !pred.accept(iterF.current())) {
            iterF.next();
        }
    }

    public void filterBackward() {
        while (!iterF.isDone() && !pred.accept(iterF.current())) {
            iterF.previous();
        }
    }

    @Override
    public void previous() {
        iterF.previous();
        filterBackward();
    }

    @Override
    public void next() {
        iterF.next();
        filterForward();
    }

    @Override
    public void first() {
        iterF.first();
        filterForward();
    }

    @Override
    public void last() {
        iterF.last();
        filterBackward();
    }

    @Override
    public boolean isDone() {
        return iterF.isDone();
    }

    @Override
    public Object current() throws IndexOutOfBoundsException {
        return iterF.current();
    }
}
