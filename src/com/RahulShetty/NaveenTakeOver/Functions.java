package com.RahulShetty.NaveenTakeOver;

public class Functions {

    public static void main(String[] args) {

        Functions obj = new Functions();

        obj.test();

        int l = obj.pqr();
        System.out.println(l);

        String test = obj.qa();
        System.out.println(test);

        int div = obj.division(20,10);
        System.out.println(div);
    }

    //non static methods

    //void does not return any value

    public void test(){ //no input, no output
        System.out.println("test method");
    }
    //return type int
    public int pqr(){ //no input, some output
        System.out.println("PQR method");
        int a = 10;
        int b = 20;
        int c = a+b;

        return c;
    }
    //retrun type String
    public String qa(){ //no input, some output
        System.out.println("QA method");
        String s = "Selenium";
        return s;
    }

    //x,y input parameters/arguments
    public int division(int x, int y){
        System.out.println("division method");
        int d = x/y;
        return d;
    }

}
