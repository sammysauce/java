package com.RahulShetty.NaveenTakeOver;

public class overload {

    public static void main(String[] args) {


        main(64);
        main(49,49);
        overload obj = new overload();
        obj.sum();
        obj.sum(50);
        System.out.println(sum(5,10));

    }

    public static void main(int i) {
        System.out.println("main method 1.1 --->" + " " + i);
    }

    public static void main(int i, int j) {
        System.out.println("main method 1.2 --->" + i + " and " + j);
    }

    //we can overload main method
    //you cannot create a method inside a method
    //duplicate methods  -- i.e same method name with same number of arguments are not allowed

    //method overloading --> when the method name is the same with different arguments or input parameters within the same class

    public void sum() {
        System.out.println("zero inputs");
    }

    public void sum(double d) {
        System.out.println("1 input");
        System.out.println(d);
    }

    public static int sum(int a, int b){
        int c= a+b;
    System.out.println("2 inputs");
        return c;



}
}
