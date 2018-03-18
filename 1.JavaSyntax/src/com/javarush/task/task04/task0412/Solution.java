package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int digit = getDigit();
        printDigit(digit);
    }
    private static int getDigit() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    private static void printDigit(int digit) {
        if (digit > 0) {
            System.out.println(digit * 2);
        } else if (digit < 0) {
            System.out.println(digit + 1);
        } else System.out.println(digit);
    }
}