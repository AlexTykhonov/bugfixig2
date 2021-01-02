package com;

import java.util.Arrays;

/**
 * сделай пожалуйста форматированный вывод
 */
public class Bug1 {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3}, {7, 8, 9}};
        // for (int mas[] : matrix) {

        // вариант 1
        System.out.println("Первый вариант вывода матрицы: ");
        System.out.println(Arrays.deepToString(matrix));
        System.out.println();
        // вариант 2
        System.out.println("Второй вариант вывода матрицы: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print((matrix[i][j]) + " ");
            }
            System.out.println();
        }
    }
}

