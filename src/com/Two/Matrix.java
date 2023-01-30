package com.Two;

public class Matrix {
    private int numberRows;
    private int numberColumns;
    private int elements[][];

    public Matrix(int numberRows, int numberColumns) {
        this.numberRows = numberRows;
        this.numberColumns = numberColumns;
        this.elements = new int[numberRows][numberColumns];
    }

    public int getNumberRows() {
        return numberRows;
    }

    public int getNumberColumns() {
        return numberColumns;
    }

    public void getElements(int i, int j) {
        int value = elements[i][j];
        System.out.println(value);
    }

    public void setElements(int i, int j, int value) {
        elements[i][j] = value;
    }

    public Matrix add(Matrix other) {
        if (numberRows != other.numberRows || numberColumns != other.numberColumns) {
            System.out.println("Matrices cannot be added");
            return null;
        }
        Matrix result = new Matrix(numberRows, numberColumns);
        for (int i = 0; i < numberRows; i++) {
            for (int j = 0; j < numberColumns; j++) {
                result.elements[i][j] = elements[i][j] + other.elements[i][j];
            }
        }
        return result;
    }

}