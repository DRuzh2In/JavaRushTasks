package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        int countDigit = 5;
        int [] digits = new int[countDigit];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < countDigit; i++) {
            digits[i] = Integer.parseInt(reader.readLine());
        }

        int minimum = min(digits[0], digits[1], digits[2], digits[3], digits[4]);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int d0, int d1, int d2, int d3, int d4) {
        int min = Integer.MAX_VALUE;
        int [] digits = {d0, d1, d2, d3, d4};
        for (int digit: digits) {
            if (digit < min) {
                min = digit;
            }
        }
        return min;
    }
}
