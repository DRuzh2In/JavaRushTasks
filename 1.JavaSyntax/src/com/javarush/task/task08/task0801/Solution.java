package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashSet<String> set = new HashSet<String>();

        String [] arr = {
                "арбуз",
                "банан",
                "вишня",
                "груша",
                "дыня",
                "ежевика",
                "жень-шень",
                "земляника",
                "ирис",
                "картофель"
                };

        for (String str: arr) {
            set.add(str);
        }

        for (String str: set) {
            System.out.println(str);
        }
    }
}
