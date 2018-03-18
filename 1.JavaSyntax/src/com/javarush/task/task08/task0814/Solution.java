package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> integers = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) {
            integers.add(i);
        }
        return integers;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        Iterator<Integer> integer = set.iterator();
        while (integer.hasNext()){
            if (integer.next() > 10) {
                integer.remove();
            }
        }
        return set;
    }

    public static void main(String[] args) {

    }
}
