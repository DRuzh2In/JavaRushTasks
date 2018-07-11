package com.javarush.task.task17.task1701;

import java.util.ArrayList;
import java.util.List;

/* 
Заметки
*/

public class Solution {
    public static void main(String[] args) {
        new NoteThread().start();
        new NoteThread().start();
    }

    public static class Note{

        public static final List<String> notes = new ArrayList<>();

        public static void addNote(String note) {
            notes.add(0, note);
        }

        public static void removeNote(String threadName) {
            String note = notes.remove(0);
            if (note == null) {
                System.out.println("Другая нить удалила нашу заметку");
            } else if (!note.startsWith(threadName)) {
                System.out.println("Нить [" + threadName + "] удалила чужую заметку [" + note + "]");
            } else {
                System.out.println("Нить [" + threadName + "] удалила свою заметку [" + note + "]");
            }
        }

        public Note() {
            new Thread(new NoteThread());
        }

        public static class NoteThread extends Thread{

            @Override
            public void run() {
                try {
                    int limit = 1000;
                    for (int i = 0; i < limit; i++) {
                        addNote(Thread.currentThread().getName() + "-Note" + i);
                        Thread.sleep(1);
                        removeNote(Thread.currentThread().getName());
                    }
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
