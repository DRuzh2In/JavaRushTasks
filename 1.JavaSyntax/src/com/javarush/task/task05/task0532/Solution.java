package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;

        //напишите тут ваш код
        int N = Integer.parseInt(reader.readLine());
        int [] digits = new int[N];
        for (int i = 0; i < N; i++) {
            digits[i] = Integer.parseInt(reader.readLine());
        }
        for (int digit: digits) {
            if (digit > maximum) {
                maximum = digit;
            }
        }

        System.out.println(maximum);
    }
}
