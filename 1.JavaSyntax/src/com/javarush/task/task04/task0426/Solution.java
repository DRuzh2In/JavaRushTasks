package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        printTypeDigit(getDigit());
    }

    private static int getDigit() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    private static void printTypeDigit(int digit) {
        if ((digit < 0) && (digit % 2 == 0)) {
            System.out.println("отрицательное четное число");
        } else if ((digit < 0) && (digit % 2 != 0)) {
            System.out.println("отрицательное нечетное число");
        } else if ((digit > 0) && (digit % 2 == 0)) {
            System.out.println("положительное четное число");
        } else if ((digit > 0) && (digit % 2 != 0)) {
            System.out.println("положительное нечетное число");
        } else {
            System.out.println("ноль");
        }
    }
}
