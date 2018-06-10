package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        Map<String, String> urlParams = getURLParams(url);
        for (Map.Entry<String, String> pair: urlParams.entrySet())
            System.out.print(pair.getKey() + " ");

        if (urlParams.containsKey("obj")){
            System.out.println();
            try {
                alert(Double.parseDouble(urlParams.get("obj")));
            } catch (Exception e) {
                alert(urlParams.get("obj"));
            }
        }
    }

    public static Map<String, String> getURLParams(String url){

        Map<String, String> urlParams = new LinkedHashMap<String, String>();
        String params = url.split("\\?")[1];
        for (String param: params.split("&")){
            if (param.contains("="))
                urlParams.put(param.split("=")[0], param.split("=")[1]);
            else
                urlParams.put(param, null);
        }
        return urlParams;
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
