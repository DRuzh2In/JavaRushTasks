package com.javarush.task.task13.task1319;

import java.io.*;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = reader.readLine();
        List<String> stringList = new ArrayList<String>();
        while (true){
            String newString = reader.readLine();
            stringList.add(newString + "\n");
            if (newString.equals("exit"))
                break;
        }
        reader.close();
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        for (String string: stringList) {
           writer.write(string);
        }
        writer.close();

    }
}
