package com.javarush.task.task05.task0513;

/*
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    int top;
    int left;
    int width;
    int height;

    public void initialize(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public void initialize(int width, int height) {
        this.height = height;
        this.width = width;
        this.left = 0;
        this.top = 0;
    }
    public void initialize(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }
    public void initialize(Rectangle rectangle) {
        this.height = rectangle.height;
        this.width = rectangle.width;
        this.left = rectangle.left;
        this.top = rectangle.top;
    }

    public static void main(String[] args) {

    }
}
