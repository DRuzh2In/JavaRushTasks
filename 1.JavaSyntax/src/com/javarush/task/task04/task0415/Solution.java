package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int sideA = getLength();
        int sideB = getLength();
        int sideC = getLength();

        if (isTrungle(sideA, sideB, sideC))
            System.out.println("Треугольник существует.");
        else System.out.println("Треугольник не существует.");

    }
    private static int getLength() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    private static boolean isTrungle(int side1, int side2, int side3) {
        if (((side1 + side2) > side3) && ((side1 + side3) > side2) && ((side2 + side3) > side1))
            return true;
        else return false;
    }
}