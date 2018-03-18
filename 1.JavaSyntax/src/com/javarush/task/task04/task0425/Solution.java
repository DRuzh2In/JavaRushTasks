package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println(getCoordinate(getdigit(), getdigit()));
    }

    private static int getdigit() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    private static int getCoordinate(int xline, int yline) {
        if ((xline > 0) && (yline > 0))
            return 1;
        else if ((xline < 0) && (yline > 0))
            return 2;
        else if ((xline < 0) && (yline < 0))
            return 3;
        else
            return 4;
    }
}
