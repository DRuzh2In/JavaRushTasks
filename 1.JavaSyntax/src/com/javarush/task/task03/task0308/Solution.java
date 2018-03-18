package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {

        int digit = 1;
        int count = 11;
        for (int i = 1; i < count; i++) {
            digit *= i;
        }
        System.out.println(digit);
        //напишите тут ваш код
    }
}
