package com.astronity.app;

public class StringComparsion {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        System.out.println("Str1 == Str2: " + (str1 == str2));
        System.out.println("Str.equal: " + str1.equals(str2));

        String str3 = new String("abc");
        System.out.println("Str3 == Str2: " + (str3 == str2));
        System.out.println("Str.equals(str2): " + str3.equals(str2));

        String str4 = null;
        System.out.println("\"abc\".equals(str4): " + ("abc".equals(str4)));
        System.out.println("str4.equals(\"abc\"): " + (str4.equals("abc")));
    }
}
