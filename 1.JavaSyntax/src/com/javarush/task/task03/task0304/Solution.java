package com.javarush.task.task03.task0304;

/* 
Задача на проценты
*/

public class Solution {
    public static double addTenPercent(int preis) {
        //напишите тут ваш код
        return preis + (preis * 10.0 / 100.0);
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
