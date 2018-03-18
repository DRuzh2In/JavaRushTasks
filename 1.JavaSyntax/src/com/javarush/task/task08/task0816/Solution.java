package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (int i = 0; i < 10; i++) {
            map.put("Stalone" + i, new Date(months[i] + " " + i + " 1980"));
        }

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator<Date> iterator = map.values().iterator();
        while (iterator.hasNext()){
            int month = iterator.next().getMonth();
            if(month > 4  && month < 8)
                iterator.remove();
        }
    }

    public static void main(String[] args) {
    }
}
