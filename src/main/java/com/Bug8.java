package com;

/**
 * сделай так чтобы при оценке 0 - выводилось просто "неизвестный результат"
 * при вводе 2 было выведено "двоечник" и тд
 * протестируй - чтобы каждой оценке соответствовал свой статус
 */
public class Bug8 {
    public static void main(String[] args) {
        int mark = 0;
        switch (mark) {
            default:
                System.out.println("неизвестный результат");
            case 1:
            case 2:
                System.out.println("двоечник");
            case 3:
                System.out.println("троечник");
            case 4:
                System.out.println("хорошист");

        }
    }
}
