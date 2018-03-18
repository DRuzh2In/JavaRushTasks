package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(Integer.parseInt(reader.readLine()));
        }

        ArrayList<Integer> ints = new ArrayList<Integer>();
        int countRepet = 1;

        for(int i = 0; i < integers.size() - 1; i++) {
            if (integers.get(i).equals(integers.get(i + 1))) {
                countRepet ++;
                ints.add(countRepet);
            } else {
                countRepet = 1;
            }
        }
        int max = 1;
        for (int count: ints){
            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);
    }
}