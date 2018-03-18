package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            String str = reader.readLine();
            arrayList.add(Integer.parseInt(str));
        }
        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> other = new ArrayList<Integer>();

        for (Integer integer: arrayList) {
            if (integer % 3 == 0) odd.add(integer);
            if (integer % 2 == 0) even.add(integer);
            if ((integer % 2 != 0) && (integer %3 != 0)) other.add(integer);
        }
        printList(odd);
        printList(even);
        printList(other);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (Integer integer: list) System.out.println(integer);
    }
}
