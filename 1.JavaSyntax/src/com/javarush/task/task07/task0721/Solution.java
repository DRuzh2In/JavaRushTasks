package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        //напишите тут ваш код
        int [] ints = new int[20];
        for (int i = 0; i < 20; i++)
            ints[i] = Integer.parseInt(reader.readLine());

        for (int integer: ints) {
            if (integer > maximum)
                maximum = integer;
            if (integer < minimum)
                minimum = integer;
        }
        System.out.print(maximum + " " + minimum);
    }
}
