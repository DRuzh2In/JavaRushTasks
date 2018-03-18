package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        int longestString = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            String addString = reader.readLine();
            if (addString.length() < longestString) {
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
