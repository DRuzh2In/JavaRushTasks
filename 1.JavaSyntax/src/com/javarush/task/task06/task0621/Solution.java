package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grendfatherName = reader.readLine();
        String grendmatherName = reader.readLine();
        String fatherName = reader.readLine();
        String matherName = reader.readLine();
        String sunName = reader.readLine();
        String dotherName = reader.readLine();


        Cat catGrendfather = new Cat(grendfatherName, null, null);
        System.out.println(catGrendfather);


        Cat catGrendmather = new Cat(grendmatherName, null, null);
        System.out.println(catGrendmather);


        Cat catFather = new Cat(fatherName, null, catGrendfather);
        System.out.println(catFather);


        Cat catMather = new Cat(matherName, catGrendmather, null);
        System.out.println(catMather);


        Cat catSun = new Cat(sunName, catMather, catFather);
        System.out.println(catSun);


        Cat catDother = new Cat(dotherName, catMather, catFather);
        System.out.println(catDother);
    }

    public static class Cat {
        private String name;
        private Cat mather;
        private Cat father;

        Cat(String name, Cat mather, Cat father) {
            this.name = name;
            this.mather = mather;
            this.father = father;
        }

        @Override
        public String toString() {
            if ((mather == null) && (father == null))
                return "Cat name is " + name + ", no mother, no father";
            else if (mather == null)
                return "Cat name is " + name + ", no mother " + " father is " + father.name;
            else if (father == null)
                return "Cat name is " + name + ", mother is " + mather.name + ", no father";
            else
                return "Cat name is " + name + ", mother is " + mather.name + ", father is " + father.name;
        }
    }

}
