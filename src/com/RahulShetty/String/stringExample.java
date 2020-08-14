package com.RahulShetty.String;

import java.sql.SQLOutput;

public class stringExample {

    public static void main(String[] args) {

        String a = "Hello";
        String ab = new String("JavaTraining");

        System.out.println(ab + "  " + a);
        System.out.println(ab.length() + " " + a.length());
        System.out.println(ab.replace("a","4"));
        System.out.println(a.charAt(2));
        System.out.println(ab.substring(4,9));
    }
}
