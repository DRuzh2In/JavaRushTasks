package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 1; i < 11; i++) {
            map.put("Surename" + i, 100 * i);
        }
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Integer> iterator = map.values().iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < 500){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}