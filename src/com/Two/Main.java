package com.Two;

public class Main
{
    public static void main(String[] args)
    {
        int x = 0;
        Matrix matrix = new Matrix(3, 3);
        for(int i = 0; i< matrix.getNumberRows(); i++)
        {
            for (int j = 0; j< matrix.getNumberColumns(); j++)
            {
                x += 1;
                matrix.setElements(i, j, x);
            }
        }

        matrix.getElements(2, 2);
    }
}
