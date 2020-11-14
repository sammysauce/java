package com.RahulShetty.NaveenTakeOver.Interface;

public class TestBank {

    public static void main(String[] args) {


        System.out.println(USBankINTF.min_bal);

        HSBCBank hs = new HSBCBank();

        hs.carLoan();
        hs.credit();
        hs.debit();
        hs.studentLoan();
        hs.transferMoney();

        //dynamic polymophism
        // child class object can be referred by parent Interface reference variable

        USBankINTF b = new HSBCBank();

        b.credit();
        b.debit();
        b.transferMoney();

        BrazilBank bz = new HSBCBank();
        bz.MutualFund();
    }
}
