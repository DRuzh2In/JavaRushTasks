package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        //напишите тут ваш код
        Cat catTom = new Cat("Tom", 3, 'm');
        Dog dog = new Dog("Dog", 3, 'm');
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //напишите тут ваш код
    public static class Dog {
        String name;
        int age;
        char sex;

        public Dog(String name, int age, char sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
    }

    public static class Cat {
        String name;
        int age;
        char sex;

        public Cat(String name, int age, char sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
    }
}
