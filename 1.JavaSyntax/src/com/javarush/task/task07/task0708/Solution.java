package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        int longestString = 0;
        for (int i = 0; i < 5; i++) {
            String addString = reader.readLine();
            if (addString.length() > longestString) {
                longestString = addString.length();
            }
            strings.add(addString);
        }

        for(String oneString: strings) {
            if (oneString.length() == longestString) {
                System.out.println(oneString);
            }
        }
    }
}
