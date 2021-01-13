package com.company;

public class Table {
    private int rows;
    private int columns;

    public Table(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    public double[][] create() {
        double[][] table = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                table[i][j] = Math.random();
            }
        }

        return table;
    }
}
