package com.company;

import java.math.BigInteger;

  public class BankAccount {
     private String cardnum;
     boolean loanapproved=false;
     private String customername;
     private String address;
     private int phonenum;

     public int getPhonenum() {
         return phonenum;
     }
     public void setPhonenum(int phonenum) {
         this.phonenum = phonenum;
     }
     public int getSalary() {
         return salary;
     }
     public void setSalary(int salary) {
         this.salary = salary;
     }

     public String getAddress() {
         return address;
     }

     public void setAddress(String address) {
         this.address = address;
     }

     public String getCustomername() {
         return customername;
     }

     public void setCustomername(String customername) {
         this.customername = customername;
     }

     private int salary;

     public String getCardnum() {
         return cardnum;
     }

     public void setCardnum(String cardnum) {
         this.cardnum = cardnum;
     }

      boolean getLoanEligibility() {
    if(salary>50000) {
        loanapproved=true;
        return loanapproved;}
    return false;}
  BankAccount(String cardnum,String customername,String address,int phonenum,int salary) {
    this.cardnum=cardnum;
    this.customername=customername;
    this.address=address;
    this.phonenum=phonenum;
    this.salary=salary;
 }
}
