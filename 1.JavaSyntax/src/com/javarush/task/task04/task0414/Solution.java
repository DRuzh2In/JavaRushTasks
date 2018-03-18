package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int year = getYear();
        if (isLeap(year))
            System.out.println("количество дней в году: 366");
        else System.out.println("количество дней в году: 365");
    }

    private static int getYear() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    private static boolean isLeap(int year) {
        //проверяю високосный год или нет
        return ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
    }
}