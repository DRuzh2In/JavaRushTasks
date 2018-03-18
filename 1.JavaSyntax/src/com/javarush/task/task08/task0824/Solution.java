package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
         ArrayList<Human> humans = new ArrayList<Human>();
         humans.add(new Human("child1", true,10, new ArrayList<Human>()));
         humans.add(new Human("chaid2", false, 5, new ArrayList<Human>()));
         humans.add(new Human("chail3", true, 1, new ArrayList<Human>()));
         humans.add(new Human("father", true, 35, new ArrayList<Human>(humans.subList(0, 3))));
         humans.add(new Human("mather", false,30, new ArrayList<Human>(humans.subList(0, 3))));
         humans.add(new Human("grendfather", true, 60, new ArrayList<Human>(humans.subList(3, 4))));
         humans.add(new Human("grendmather", false, 50, new ArrayList<Human>(humans.subList(3, 4))));
         humans.add(new Human("grendfather2", true, 60, new ArrayList<Human>(humans.subList(4, 5))));
         humans.add(new Human("grandmather2", false, 50, new ArrayList<Human>(humans.subList(4, 5))));

         for (Human human: humans)
             System.out.println(human);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
