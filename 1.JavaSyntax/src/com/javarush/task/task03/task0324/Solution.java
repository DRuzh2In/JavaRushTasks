package com.javarush.task.task03.task0324;

/* 
Меркантильные намерения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        printTxt(10, "Я хочу большую зарплату, и для этого изучаю Java");
    }

    public static void printTxt(int repeat, String text) {

        for (int i = 0; i < repeat; i++) {
            System.out.println(text);
        }
    }
}
