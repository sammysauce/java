package com.RahulShetty.NaveenTakeOver;

public class cars {
    int year;
    String mod;


    public static void main(String[] args) {
        cars a = new cars();
        cars b = new cars();
        cars c = new cars();

        System.out.println("before assigned values");
       a.year=2020;
       a.mod="GLE";

       b.year=2004;
       b.mod="focus";

       c.year=2021;
       c.mod="S-Class";

        System.out.println(a.mod);
        System.out.println(a.year);
        System.out.println(b.mod);
        System.out.println(b.year);
        System.out.println(c.mod);
        System.out.println(c.year);

        System.out.println("After values added");


        a=b;
        b=c;
        c=a;

        a.mod="Range Rover Sport";

        System.out.println(a.mod);
    }
}
