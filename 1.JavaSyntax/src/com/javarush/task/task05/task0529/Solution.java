package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int sum = 0;
        boolean flag = false;
        while (!flag) {
            String[] digits = getDigit();
            sum += getSum(digits);
            flag = getFlag(digits);
        }
        System.out.println(sum);
    }

    private static int getSum(String [] digits) throws IOException {
        int sum = 0;
        for (String digit : digits) {
            if (digit.equals("сумма")) {
                break;
            } else {
                sum = sum + Integer.parseInt(digit);
            }
        }
        return sum;
    }

    private static String [] getDigit() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String getDigits = reader.readLine();
        String [] digits = getDigits.split(" ");
        return digits;
    }

    private static boolean getFlag(String [] strings) {
        boolean flag = false;
        for (String str: strings) {
            if (str.equals("сумма")) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
