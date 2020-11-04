package com.RahulShetty.NaveenTakeOver;

public class Functions {

    //main method --> starting point of execution
    public static void main(String[] args) {

        Functions obj = new Functions();
        //one object will be created, obj is the reference variable, referring to this object
        //after creating the object, the copy of all non static methods will be given to this object

        obj.test();

        int l = obj.pqr();
        System.out.println(l);

        String test = obj.qa();
        System.out.println(test);

        int div = obj.division(20, 10);
        System.out.println(div);

        //main method is void -- never returns a value
    }

    //non static methods
    //void does not return any value
    //return type = void

    public void test() { //no input, no output
        // System.out.println("test method");
    }

    //return type int
    public int pqr() { //no input, some output
        //  System.out.println("PQR method");
        int a = 10;
        int b = 20;
        int c = a + b;

        return c;
    }

    //retrun type String
    public String qa() { //no input, some output
        // System.out.println("QA method");
        String s = "Selenium";
        return s;
    }

    //x,y input parameters/arguments
    public int division(int x, int y) {
        // System.out.println("division method");
        int d = x / y;
        return d;
    }

}
