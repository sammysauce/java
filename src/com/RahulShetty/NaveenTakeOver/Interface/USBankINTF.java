package com.RahulShetty.NaveenTakeOver.Interface;

public interface USBankINTF {

    int min_bal = 100;

    void credit();

    void debit();

    void transferMoney();

    //only method declaration
    //no method body - only method prototype
    //in interface, we can declare the variables, variables are by default static in nature
    //variables value cannot be changed, it's final/constant in nature
    //no static methods are allowed in interface - interfaces are part of objects. Objects cannot have static method
    //we can not create the object of Interface
    //Interface is abstract in nature

}
