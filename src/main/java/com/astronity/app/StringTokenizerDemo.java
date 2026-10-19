package com.astronity.app;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        String input = "apple;orange;banana:mango";
        StringTokenizer tokenizer = new StringTokenizer(input, ";:");
        while(tokenizer.hasMoreTokens())
        {
            String token = tokenizer.nextToken();
            System.out.println("Token "+token);
        }

        input = "age=20;name=John;";

        tokenizer = new StringTokenizer(input,";:");
        while(tokenizer.hasMoreTokens())
        {
            String entry = tokenizer.nextToken();
            String []keyValues = entry.split("=");
            System.out.println("Key "+keyValues[0]+" Value "+keyValues[1]);
        }
    }
}
