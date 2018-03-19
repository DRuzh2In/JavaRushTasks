package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код

        List<Integer> integerList = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                integerList.add(Integer.parseInt(reader.readLine()));
            } catch (IOException e) {
            } catch (NumberFormatException e){
                for (Integer integer: integerList){
                    System.out.println(integer);
                }
                return;
            }
        }
    }
}
