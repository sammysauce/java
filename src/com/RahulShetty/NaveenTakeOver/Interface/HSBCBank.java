package com.RahulShetty.NaveenTakeOver.Interface;

public class HSBCBank implements USBankINTF, BrazilBank{ //we are achieving multiple inheritance
    //Is-a relationship Interface to class relationship - implements
    //Has- a relationship - class to class relationship - extends


    //if a class is implementing any interface then it's mandatory to define/override all the methods of interface.
    //overriding from USBank


    public void credit(){
        System.out.println("HSBC credit");
    }

    public void debit(){
        System.out.println("HSBC debit");
    }

    public void transferMoney(){
        System.out.println("HSBC transfer money");
    }

    //Separate methods of HSBCBank Class
    public void studentLoan(){
        System.out.println("HSBC - student loan");
    }

    public void carLoan(){
        System.out.println("HSBC - car loan");
    }

    //Brazil bank method overriding from BrazilBank class
    public void MutualFund(){
        System.out.println("HSBC - mutual fund");
    }
}
