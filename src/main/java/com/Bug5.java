package com;

/**
 * *сделай так чтобы End все же вывелся в консоль - разбери зацикливание
 */
public class Bug5 {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i % 200 == 0) continue;

            System.out.println("Start Break");
            break;
        }

        System.out.println("End");
    }
}

