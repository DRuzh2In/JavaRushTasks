package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("man1", 20, "man1");
        Man man2 = new Man("man2", 30, "man2");
        System.out.println(man1.toString());
        System.out.println(man2.toString());
        Woman woman1 = new Woman("women1", 20, "woman1");
        Woman woman2 = new Woman("women2", 30, "women2");
        System.out.println(woman1.toString());
        System.out.println(woman2.toString());
    }

    //напишите тут ваш код
    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }
    }
}
