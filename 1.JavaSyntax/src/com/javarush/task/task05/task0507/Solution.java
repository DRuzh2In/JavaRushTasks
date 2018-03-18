package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countDigit = -1;
        double sum = 1;
        double curDigit = 0;
        while (curDigit != -1) {
            curDigit = Integer.parseInt(reader.readLine());
            sum += curDigit;
            countDigit ++;
        }
        System.out.println(sum / countDigit);
    }
}

