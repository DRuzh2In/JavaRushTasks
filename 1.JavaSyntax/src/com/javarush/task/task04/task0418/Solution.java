package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int first = getDigit();
        int second = getDigit();
        if ((first > second) || (first == second)) {
            System.out.println(second);
        } else {
            System.out.println(first);
        }
    }

    private static int getDigit() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }
}