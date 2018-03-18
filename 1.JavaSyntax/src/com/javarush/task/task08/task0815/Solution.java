package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (int i = 0; i < 10; i++) {
            hashMap.put("Surname" + i, "Name" + i);
        }
        return hashMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int countName = 0;
        for(HashMap.Entry<String, String> pair: map.entrySet()) {
            if (name.equals(pair.getValue())) {
                countName ++;
            }
        }
        return countName;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int countSurName = 0;
        for (HashMap.Entry<String, String> pair: map.entrySet()) {
            if (lastName.equals(pair.getKey())) {
                countSurName ++;
            }
        }
        return countSurName;
    }

    public static void main(String[] args) {

    }
}
