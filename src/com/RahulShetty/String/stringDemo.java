package com.RahulShetty.String;

import java.util.jar.JarOutputStream;

public class stringDemo {
    public static void main(String[] args) {

        String a = "hello";
        String b = "hello";
        String c=a.concat("World");
        System.out.println(a);
        String s = new String ("hello");
        String s1 = new String ("hello");

        System.out.println(a.equals(b));
        System.out.println(a==b);
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.equals(s1));
        System.out.println(s==s1);


       StringBuffer sb = new StringBuffer("hello");
       sb.append("world");
        System.out.println(sb);
        sb.insert(2,"She");
        System.out.println(sb);
        sb.delete(0,8);
        System.out.println(sb);
        sb.replace(0,4,"Good Bye ");
        System.out.println(sb);
        sb.deleteCharAt(4);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
