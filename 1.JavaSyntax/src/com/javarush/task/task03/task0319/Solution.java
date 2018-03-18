package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String name = getTypeText();
        String firstDigit = getTypeText();
        String secondDigit = getTypeText();
        printText(name, firstDigit, secondDigit);
    }

    private static String getTypeText() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    private static void printText(String name, String firstDigit, String secondDigit) {

        System.out.print(name + " получает " + firstDigit + " через " + secondDigit + " лет.");
    }
}
