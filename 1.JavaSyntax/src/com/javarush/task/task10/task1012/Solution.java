package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        // напишите тут ваш код
        HashMap<Character, Integer> countAlphabet = new HashMap<Character, Integer>();
        for (char c: alphabet) {
            countAlphabet.put(c,0);
        }

        for (String str: list) {
            char [] ch = str.toCharArray();
            for (char c: ch) {
                if (Character.isAlphabetic(c)) {
                    countAlphabet.put(c, countAlphabet.get(c)+1);
                }
            }
        }
        for (char c: abcArray) {
            System.out.println(c + " " + countAlphabet.get(c));
        }


    }

}
