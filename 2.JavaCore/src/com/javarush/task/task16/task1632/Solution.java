package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    static {
        threads.add(new Thread(new MyThreadFirst()));
        threads.add(new Thread(new MyThreadSecond()));
        threads.add(new Thread(new UraThread()));
        threads.add(new MassageThread());
        threads.add(new Thread(new SumThread()));

    }
    public static void main(String[] args) {

        for (Thread thread: threads)
            thread.start();
    }

    public static class MyThreadFirst implements Runnable {

        @Override
        public void run() {
            while (true) {
            }
        }
    }

    public static class MyThreadSecond implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class UraThread implements Runnable {
        @Override
        public void run() {

            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class MassageThread extends Thread implements Message {

        public void run() {
            while (!isInterrupted()) {}
        }

        @Override
        public void showWarning() {
            interrupt();
        }
    }

    public static class SumThread implements Runnable {


        @Override
        public void run() {
            Integer sum = 0;
            String string = "";
            while (!string.equals("N")) {
                try {
                    string = reader.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    sum = sum + Integer.parseInt(string);
                } catch (NumberFormatException e){

                }
            }
            System.out.println(sum);
        }
    }
}