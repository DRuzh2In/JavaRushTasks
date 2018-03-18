package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        getColor(getTime());
    }

    private static double getTime() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Float.parseFloat(reader.readLine());
    }

    private static void getColor(double time) {
       int a = (int)time % 5;
       if (a >= 0 && a < 3)
           System.out.println("зелёный");
       else if (a >= 3 && a < 4 )
           System.out.println("жёлтый");
       else
           System.out.println("красный");
    }
}