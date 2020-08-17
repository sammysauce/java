package com.RahulShetty.Interview;

public class BiggestPrint {

    public static void main(String[] args) {

        int abc [] [] = {{9, 5, 6},{7, 9, 2}, {4, 1, 7}};
        int max = abc[0][0];

        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {
                if (abc[i][j]>max)
                {
                    max = abc[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
