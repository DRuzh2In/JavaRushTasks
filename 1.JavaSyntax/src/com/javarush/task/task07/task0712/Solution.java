package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        int indexMinString = -1;
        int minLengthString = Integer.MAX_VALUE;
        int indexMaxString = -1;
        int maxLengthString = Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            String str = reader.readLine();
            if (str.length() > maxLengthString) {
                maxLengthString = str.length();
            } else if (str.length() < minLengthString) {
                minLengthString = str.length();
            }
            arrayList.add(str);
        }
        for (String str: arrayList) {
            if ((str.length() == maxLengthString) || (str.length() == minLengthString)) {
                System.out.println(str);
                break;
            }
        }
    }
}
