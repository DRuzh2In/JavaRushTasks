package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

import java.util.Date;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String firstName;
        private String secondName;
        private Date dob;
        private boolean sex;
        private Human spouse;
        private List<Human> children;

        public Human(String firstName, String secondName, Date dob, boolean sex, Human spouse, List<Human> children) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.dob = dob;
            this.sex = sex;
            this.spouse = spouse;
            this.children = children;
        }

        public Human(String firstName, String secondName, Date dob, boolean sex) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.dob = dob;
            this.sex = sex;
            this.spouse = null;
            this.children = null;
        }

        public Human(String firstName, String secondName, Date dob, boolean sex, List<Human> children) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.dob = dob;
            this.sex = sex;
            this.spouse = null;
            this.children = children;
        }

        public Human(String firstName, String secondName, Date dob, boolean sex, Human spouse) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.dob = dob;
            this.sex = sex;
            this.spouse = spouse;
            this.children = null;
        }

        public Human(Human human) {
            this.spouse = human.spouse;
        }

        public Human(List<Human> list) {
            this.children = list;
        }

        public Human(String firstName, String secondName, Date dob) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.dob = dob;
        }

        public Human(String firstName) {
            this.firstName = firstName;
        }

        public Human(Date dob) {
            this.dob = dob;
        }

        public Human(boolean sex) {
            this.sex = sex;
        }
    }
}
