package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int N = 4;
        int [] digits = new int[N];

        for (int i = 0; i < N; i++)
            digits[i] = getDigit();

        int maximum = getMaximum(digits);

        System.out.println(maximum);
    }

    private static int getDigit() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    private static int getMaximum(int [] digits) {

        int maximum = Integer.MIN_VALUE;

        for (int digit : digits)
            if (digit > maximum) {
                maximum = digit;
            }

        return maximum;
    }
}