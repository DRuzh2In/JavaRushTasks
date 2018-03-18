package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int first = getDigit();
        int second = getDigit();
        int third = getDigit();
        if ((first != second) && (second == third))
            System.out.println(1);
        if ((second != third) && (third == first))
            System.out.println(2);
        if ((third != first) && (first == second))
            System.out.println(3);
    }

    private static int getDigit() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }
}
