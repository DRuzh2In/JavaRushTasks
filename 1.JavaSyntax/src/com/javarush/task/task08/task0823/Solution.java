package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        //напишите тут ваш код
        char [] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == 0) {
                if (Character.isLetter(chars[i])){
                    chars[i] = Character.toUpperCase(chars[i]);
                }
            } else {
                if (chars[i - 1] == ' ' && Character.isLetter(chars[i])) {
                    chars[i] = Character.toUpperCase(chars[i]);
                }
            }
        }
        System.out.println(new String(chars));
    }
}
