package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int vertical = getDigit();
        int horizontal = getDigit();
        for (int i = 0; i < vertical; i++) {
            for (int j = 0; j < horizontal; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }

    private static int getDigit() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }
}
