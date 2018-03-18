package com.javarush.task.task07.task0718;

import java.awt.geom.Area;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> stringArrayList = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
            stringArrayList.add(reader.readLine());
        int lengthString = 0;
        for (String str: stringArrayList) {
            if (str.length() >= lengthString) {
                lengthString = str.length();
            } else {
                System.out.println(stringArrayList.indexOf(str));
                break;
            }
        }

    }
}

