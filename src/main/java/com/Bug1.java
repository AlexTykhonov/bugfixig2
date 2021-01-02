package com;

/**
 * сделай пожалуйста форматированный вывод
 */
public class Bug1 {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3}, {7, 8, 9}};
        for (int mas[] : matrix) {
            for (int i=0;i<mas.length;i++)
            System.out.println(mas[i]);
        }
    }
}
