package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException, IOException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут
        t1.start();
        t1.join();

        t2.start();
        t2.join();

        reader.close();

        t1.printResult();
        t2.printResult();
    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread {

        private List<String> result = new ArrayList<String>();
        private int countReadString = 3;

        @Override
        public void run() {
            try {
                for (int i = 0; i < countReadString; i++) {
                    result.add(reader.readLine());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void printResult() {
            String stringResult = "";
            for (int i = 0; i < result.size(); i++)
                stringResult += (result.get(i) + " ");
            System.out.println(stringResult);;
        }
    }
}
