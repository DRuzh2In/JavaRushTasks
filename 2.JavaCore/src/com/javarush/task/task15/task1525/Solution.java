package com.javarush.task.task15.task1525;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.javarush.task.task15.task1525.Statics;

/* 
Файл в статическом блоке
*/

public class Solution {


    public static List<String> lines = new ArrayList<String>();

    static {
        String s = Statics.FILE_NAME;
        try {
            lines = Files.readAllLines(Paths.get(s), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
