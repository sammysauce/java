package com.RahulShetty.NaveenTakeOver;

public class CallByValAndCallByRef {

    int p;
    int q;


    public static void main(String[] args) {

        CallByValAndCallByRef obj = new CallByValAndCallByRef();
        int x = 100;
        int y = 50;
        System.out.println(obj.testSum(x,y)); // call by value

        obj.p = 50;
        obj.q = 60;

        obj.swap(obj);

        System.out.println(obj.p);
        System.out.println(obj.q);
    }

    public int testSum(int a, int b){
      //  a = 40;
       // b = 50;
        int c = a+b;
        return c;

}

public void swap(CallByValAndCallByRef t){
    // call by reference
        int temp;
        temp = t.p; // temp = 50
        t.p=t.q; // t.p = 60
        t.q =temp; // t.q = 50



}
}
