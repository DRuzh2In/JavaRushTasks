package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Human grandF1 = new Human("GrandF1", false,65);
        Human grandF2 = new Human("GrandF2", false,60);
        Human grandM1 = new Human("GrandM1", true, 40);
        Human drandM2 = new Human("GrandM2", true,55);
        Human father = new Human("father", false,35, grandF1, grandM1);
        Human mather = new Human("mather", true, 35, grandF2, grandM1);
        Human child1 = new Human("child1", true, 8, father, mather);
        Human child2 = new Human("child2", true, 6, father, mather);
        Human child3 = new Human("child3", false, 2, father, mather);

        System.out.println(grandF1.toString());
        System.out.println(grandM1.toString());
        System.out.println(grandF2.toString());
        System.out.println(drandM2.toString());
        System.out.println(father.toString());
        System.out.println(mather.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















