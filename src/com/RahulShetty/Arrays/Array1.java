package com.RahulShetty.Arrays;

import javax.xml.ws.BindingType;

public class Array1 {

    public static void main(String[] args) {

        //Interger data type
        int a[] = new int[4];
        a[0] = 10;
        a[1] = 7;
        a[2] = 72;
        a[3] = 2;

        int b[] = {1, 34, 62, 85, 9};

        for (int i = 0; i < a.length; i++)

            System.out.println(a[i]);

    //String datatype
    String s[] = new String[3];
    s[0] = "Hello";
    s[1] = "Good monring";
    s[2] = "Bye";

    System.out.println(s[1]);




    }
}
