package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int newDigit = 0;
        while(newDigit != -1) {
            newDigit = Integer.parseInt(reader.readLine());
            sum += newDigit;
        }
        System.out.println(sum);

    }
}
