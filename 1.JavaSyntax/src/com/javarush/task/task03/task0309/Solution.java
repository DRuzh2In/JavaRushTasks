package com.javarush.task.task03.task0309;

/* 
Сумма 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int sum = 0;
        int count = 11;
        for (int i = 1; i < count; i++) {
            sum += i;
            System.out.println(sum);
        }
    }
}
