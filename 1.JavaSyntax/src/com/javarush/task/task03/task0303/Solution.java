package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

import java.sql.SQLOutput;

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertEurToUsd(12, 3.4));
        System.out.println(convertEurToUsd(10, 3));
    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        return eur * course;
    }
}
