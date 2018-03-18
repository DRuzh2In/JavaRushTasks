package com.javarush.task.task03.task0320;


/* 
Скромность украшает программиста
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String name = getTypeText();
        printText(name);
}

    private static String getTypeText() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    private static void printText(String name) {

        System.out.print(name + " зарабатывает $5,000. Ха-ха-ха!");
    }
}
