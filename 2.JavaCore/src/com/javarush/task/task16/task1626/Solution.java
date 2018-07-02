package com.javarush.task.task16.task1626;

public class Solution {
    public static int number = 5;

    public static void main(String[] args) throws InterruptedException {

        CountDownRunnable downRunnable = new CountDownRunnable();
        Thread downThread = new Thread(downRunnable, "Уменьшаем");
        downThread.start();
        downThread.join();

        CountUpRunnable countUpRunnable = new CountUpRunnable();
        Thread upThread = new Thread(countUpRunnable, "Увеличиваем");
        upThread.start();
        upThread.interrupt();
    }

    public static class CountUpRunnable implements Runnable {
        //Add your code here - добавь код тут

        private int countIndexUp;

        @Override
        public void run() {
            try {
                while (true) {

                    ++countIndexUp;
                    System.out.println(toString());
                    Thread.sleep(500);
                    if (countIndexUp == number) return;
                }
            } catch (InterruptedException e) {
            }
        }

        @Override
        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexUp;
        }
    }


    public static class CountDownRunnable implements Runnable {
        private int countIndexDown = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}
