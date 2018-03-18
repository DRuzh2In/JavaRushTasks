package com.javarush.task.task06.task0609;

/*
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код
        int x1x2 = Math.abs(x1) + Math.abs(x2);
        int y1y2 = Math.abs(y1) + Math.abs(y2);
        return Math.sqrt(x1x2 * x1x2 + y1y2 * y1y2);
    }

    public static void main(String[] args) {

    }
}
