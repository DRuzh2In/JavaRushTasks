package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] ints1 = new int[20];
        int [] ints2 = new int[10];
        int [] ints3 = new int[10];
        for (int i = 0; i < ints1.length; i++) {
            ints1[i] = Integer.parseInt(reader.readLine());
        }
        ints2 = Arrays.copyOfRange(ints1, 0, ints1.length/2 - 1);
        ints3 = Arrays.copyOfRange(ints1, ints1.length/2, ints1.length);
        for (int digit: ints3) {
            System.out.println(digit);
        }
    }
}
