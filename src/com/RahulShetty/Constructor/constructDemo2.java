package com.RahulShetty.Constructor;

public class constructDemo2 {

    public constructDemo2() {
        System.out.println("I am the constructor demo");
        System.out.println("I am the constructor demo lecture 1");
    }

    // Paramateized structure

    public constructDemo2(int a, int b)
    {
        System.out.println("I am in the parameterized constructor ");
        int c=a+b;
        System.out.println(c);
    }
    public constructDemo2(String str)
    {
        System.out.println(str);
    }
    public void getData() {
        System.out.println("I am the method ");
    }


    public static void main(String[] args) {
      constructDemo2 cd = new constructDemo2("String Test");
        constructDemo2 cd2 = new constructDemo2(9,5);
        constructDemo2 cd3 = new constructDemo2("Jonsing");


    }
}
