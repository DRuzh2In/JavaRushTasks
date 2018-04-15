package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        //get path to file
        BufferedReader getFilePath = new BufferedReader(new InputStreamReader(System.in));
        String filePath = getFilePath.readLine();
        getFilePath.close();

        List <Integer> evenDigits = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(filePath), StandardCharsets.UTF_8))){
            String line;
            while ((line = reader.readLine()) != null) {
                int digit = Integer.parseInt(line);
                if (digit % 2 == 0) {
                    evenDigits.add(digit);
                }
            }
        } catch (IOException e) {
            // log error
        }

        for (int i = 0; i < evenDigits.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < evenDigits.size() ; j++) {
                if (evenDigits.get(min) > evenDigits.get(j))
                    min = j;
            }
            if (min != i) {
                int exchenge = evenDigits.get(i);
                evenDigits.set(i, evenDigits.get(min));
                evenDigits.set(min, exchenge);
            }
        }
        for (int evenDigit: evenDigits){
            System.out.println(evenDigit);
        }
    }
}
