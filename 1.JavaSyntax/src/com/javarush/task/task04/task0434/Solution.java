package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int i = 1;
        int j = 1;
        int digit = 1;
        while (i < 11){
            while (j < 11) {
                System.out.print(digit * j + " ");
                j++;
            }
            j = 1;
            i++;
            digit++;
            if (i < 11) {
                System.out.println();
            }
        }
    }
}
