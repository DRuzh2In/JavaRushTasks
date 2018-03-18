package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String year = getYear();
        String name = getName();
        printText(name, year);
    }

    private static String getTypeText() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    private static void printText(String name, String year) {

        System.out.print(name + " захватит мир через " + year + " лет. Му-ха-ха!");
    }

    private static String getName() throws IOException {

        //System.out.print("Введите имя: ");
        return getTypeText();
    }

    private static String getYear() throws IOException {

        //System.out.print("Введите промежуток времени (лет): ");
        return getTypeText();
    }
}
