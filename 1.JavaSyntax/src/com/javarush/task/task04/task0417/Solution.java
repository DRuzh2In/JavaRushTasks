package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        equalsDigit(getDigit(), getDigit(), getDigit());
    }

    private static int getDigit() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    private static void equalsDigit(int first, int second, int third) {
        if (first == second) {
            if (second == third) {
                System.out.println(first + " " + second + " " + third);
            } else {
                System.out.println(first + " " + second);
            }
        } else if (second == third) {
            if (first == third) {
                System.out.println(first + " " + second + " " + third);
            } else {
                System.out.println(second + " " + third);
            }
        } else if (first == third) {
            if (second  == third) {
                System.out.println(first + " " + second + " " + third);
            } else {
                System.out.println(first + " " + third);
            }
        } else {
            return;
        }
    }
}