package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int count = 3;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int [] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = Integer.parseInt(reader.readLine());
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > max) {
                max = digit;
            }
            if (digit < min) {
                min = digit;
            }
        }

        int avg = 0;

        for (int digit : digits) {
            if ((digit > min) && (digit < max)){
                avg = digit;
            }
        }

        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (digits[i] == digits[j]){
                    avg = digits[i];
                    break;
                }
            }
        }
        System.out.println(avg);
    }
}
