package com.javarush.task.task04.task0428;

/* 
Положительное число
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
        System.out.println(getCountPositiveDigit(digit));
    }

    private static int getDigit() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    private static int getCountPositiveDigit(int [] digit) {

        int countPositiveDigit = 0;
        for (int oneDigit : digit) {
            if (oneDigit > 0) {
                countPositiveDigit += 1;
            }
        }
        return countPositiveDigit;
    }
}
