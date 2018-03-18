package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date end = new Date(date);
        Date start = new Date(date);
        start.setDate(1);
        start.setMonth(0);

        long endTime = end.getTime();
        long startTime = start.getTime();
        long countTime = endTime - startTime;
        long days = (int)(countTime / 1000 / 60 / 60 / 24);

        if (days % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
