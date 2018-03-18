package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        int digit = getDigit();
        int lengthDigit = Integer.toString(digit).length();
        if ((digit < 1) || (digit > 999)){
            return;
        } else if ((digit % 2 == 0) && (lengthDigit == 1)) {
            System.out.println("четное однозначное число");
        } else if ((digit % 2 != 0) && (lengthDigit == 1)) {
            System.out.println("нечетное однозначное число");
        } else if ((digit % 2 == 0) && (lengthDigit == 2)) {
            System.out.println("четное двузначное число");
        } else if ((digit % 2 != 0) && (lengthDigit == 2)) {
            System.out.println("нечетное двузначное число");
        } else if ((digit % 2 == 0) && (lengthDigit == 3)) {
            System.out.println("четное трехзначное число");
        } else if ((digit % 2 != 0) && (lengthDigit == 3)) {
            System.out.println("нечетное трехзначное число");
        }
    }

    private static int getDigit() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }
}