package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

     public void initialize(String name) {
        this.name = name;
        this.age = 1;
        this.weight = 2;
        this.color = "red";
        this.address = null;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "red";
        this.address = null;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 2;
        this.color = "red";
        this.address = null;
    }

    public void initialize(int weight, String color) {
        this.name = null;
        this.age = 2;
        this.weight = weight;
        this.color = color;
        this.address = null;
    }

    public void initialize(int weight, String color, String address) {
        this.name = null;
        this.age = 1;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
