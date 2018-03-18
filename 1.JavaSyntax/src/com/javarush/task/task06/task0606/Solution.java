package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        String digits = getDigit();
        char [] chars = digits.toCharArray();
        for (char ch: chars) {
            if (Character.isDigit(ch)) {
                int digit = Character.getNumericValue(ch);
                if (digit % 2 == 0) {
                    even ++;
                } else {
                    odd ++;
                }
            }
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }

    private static String getDigit() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
}
