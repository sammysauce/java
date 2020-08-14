package com.RahulShetty.String;

public class reverseDemo {

    public static void main(String[] args) {

        String s = "Warzone";
        String t = "";

        for (int i = s.length()-1; i>=0; i--)
        {
           t=t+s.charAt(i);
        }

        System.out.println("Warzone spelt backwards = " + t);

        //if(s==t);


        //System.out.println(new StringBuilder(s).reverse().toString());




        }
    }

