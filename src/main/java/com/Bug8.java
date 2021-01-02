package com;

/**
 * сделай так чтобы при оценке 0 - выводилось просто "неизвестный результат"
 * при вводе 2 было выведено "двоечник" и тд
 * протестируй - чтобы каждой оценке соответствовал свой статус
 */
public class Bug8 {
    public static void main(String[] args) {
        int mark = 4;
        switch (mark) {
            default:
                System.out.println("неизвестный результат");break;
            case 1:break;
            case 2:
                System.out.println("двоечник");break;
            case 3:
                System.out.println("троечник");break;
            case 4:
                System.out.println("хорошист");break;
        }
    }
}


//добавил во всех кейсах break.