package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer N = Integer.parseInt(reader.readLine());
        Integer M = Integer.parseInt((reader.readLine()));
        ArrayList<String> stringArrayList = new ArrayList<String>();
        for (int i = 0; i < N; i++) {
            stringArrayList.add(reader.readLine());
        }
        for (int i = 0; i < M; i++) {
            String str = stringArrayList.get(0);
            stringArrayList.add(str);
            stringArrayList.remove(0);
        }
        for (String str: stringArrayList) {
            System.out.println(str);
        }
        //напишите тут ваш код
    }
}
