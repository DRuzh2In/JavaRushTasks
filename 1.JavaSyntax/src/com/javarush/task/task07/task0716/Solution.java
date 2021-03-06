package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if ((str.contains("р")) && (!str.contains("л"))) {
                list.remove(i);
                i--;
            }
            if ((str.contains("л")) && (!str.contains("р"))){
                list.add(i + 1, str);
                i++;
            }
            if ((str.contains("р")) && (str.contains("л")))
                continue;
        }
        return list;
    }
}