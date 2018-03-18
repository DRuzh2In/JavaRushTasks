package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int countDidit = 3;
        int [] digit = new int[countDidit];
        for (int i = 0; i < countDidit; i++) {
            digit[i] = getDigit();
        }
        int [] countDiditType = getCountDigitType(digit);

        System.out.println("количество отрицательных чисел: " + countDiditType[1]);
        System.out.println("количество положительных чисел: " + countDiditType[0]);
    }

    private static int getDigit() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    private static int [] getCountDigitType(int [] digit) {

        int [] countDigitType = new int[2];

        for (int oneDigit : digit) {
            if (oneDigit > 0) {
                countDigitType[0] += 1;
            } else if (oneDigit < 0) {
                countDigitType[1] += 1;
            }
        }
        return countDigitType;
    }
}
