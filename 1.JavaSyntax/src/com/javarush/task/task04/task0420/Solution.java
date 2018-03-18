package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int sizeArr = 10;
        int [] digits = getDigit(sizeArr);
        digits = sortDigitArr(digits);
        for (int digit : digits) System.out.print(digit + " ");
    }

    private static int [] getDigit(int sizeArr) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] digit = new int[sizeArr];
        for (int i = 0; i < sizeArr; i++)
            digit[i] = Integer.parseInt(reader.readLine());
        return digit;
    }

    private static int [] sortDigitArr (int [] digitArr) {

        for(int i = 0; i < digitArr.length - 1; i++)
        {
            int max = i;
            for(int j = i + 1; j < digitArr.length ;j++)
            {
                if(digitArr[max] < digitArr[j])
                {
                    max = j;
                }
            }
            if(i != max)
            {
                int chenge = digitArr[i];
                digitArr[i] = digitArr[max];
                digitArr[max] = chenge;
            }
        }
        return digitArr;
    }
}
