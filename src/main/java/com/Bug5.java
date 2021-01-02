package com;

/**
 * *сделай так чтобы End все же вывелся в консоль - разбери зацикливание
 */
public class Bug5 {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i % 200 == 0) {i++;continue;}
            System.out.println("Start Break");
            break;
        }

        System.out.println("Cycles made: "+(i+1));
        System.out.println("End");
    }
}

//исходное условие в if бесконечно спрашивает одно и то же. I остается без изменений. Если добавить что i увеличивается - цикл прекращается.