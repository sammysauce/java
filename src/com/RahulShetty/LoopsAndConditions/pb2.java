package com.RahulShetty.LoopsAndConditions;

public class pb2 {
    public static void main(String[] args) {
        int k = 3;
        for (int i = 0; i < 15; i = i+3) {
            for (int j = 1; j <= i; j=j+3) {
                System.out.print(k);
                System.out.print("\t");
                k=k+3;

            }
            System.out.println(" ");
        }
    }
}