package com.RahulShetty;

import com.RahulShetty.String.secondclass;

public class Main {

    int z = 10;

    public void getData(){


        System.out.println("I am in a method");

       // return "HELLO";


    }

    static int a = 4;

    public static void main(String[] args) {
	// write your code here
        Main fn = new Main();
            secondclass sn = new secondclass();
        sn.setData();
        fn.getData();
        System.out.println(fn.z);



        //System.out.println(a);
        System.out.println("hi");
        System.out.println("hello world");
    }
}
