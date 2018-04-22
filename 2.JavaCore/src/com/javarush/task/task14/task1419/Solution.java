package com.javarush.task.task14.task1419;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        try {
            FileInputStream fis = new FileInputStream("C2:\badFileName.txt");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int [] a = new int[1];
            a[2] = 0;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int a = Integer.parseInt(null);
            int b = a + 1;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int [] a = new int[-2];
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            List<String> list = new ArrayList<>();
            list.get(3);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new IOException();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new SocketException();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new IllegalArgumentException();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new RuntimeException();
        } catch (Exception e) {
            exceptions.add(e);
        }

    }
}
