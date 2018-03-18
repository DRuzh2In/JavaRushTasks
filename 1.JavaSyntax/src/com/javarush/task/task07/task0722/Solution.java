package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.SplittableRandom;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        String str = "";
        while (!(str = reader.readLine()).equals("end")) {
            list.add(str);
        }
        //напишите тут ваш код
        for (String string: list) {
            System.out.println(string);
        }
    }
}