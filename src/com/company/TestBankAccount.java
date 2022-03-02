package com.company;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount b=new BankAccount("612345678912433","Geetha Bhupathi1","Canada",900234567,65000);
        //System.out.println(b.cardnum);
        System.out.println(b.getCardnum());
        if(b.getLoanEligibility())
            System.out.println("Congrats you are eligible for loan");
        else
            System.out.println("Sorry you are not eligible for loan");
    }
}
