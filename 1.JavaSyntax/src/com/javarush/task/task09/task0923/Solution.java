package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        char [] chars = string.toCharArray();
        String vowelChars = new String();
        String consonantChars = new String();

        for (char ch: chars) {
            if (ch != ' '){
                if (isVowel(ch)){
                    vowelChars += ch;
                    vowelChars += " ";
                } else {
                    consonantChars += ch;
                    consonantChars += " ";
                }
            }
        }
        System.out.println(vowelChars);
        System.out.println(consonantChars);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}