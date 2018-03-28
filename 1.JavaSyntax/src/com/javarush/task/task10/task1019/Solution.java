package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        while (true) {
            Integer id;
            String name;

            try {
                id = Integer.parseInt(reader.readLine());
                name = reader.readLine();
            } catch (NumberFormatException e) {
                break;
            }
            if (!hashMap.containsKey(name)) {
                hashMap.put(name, id);
            }
        }
        for (HashMap.Entry<String, Integer> pair: hashMap.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}
