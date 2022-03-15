package com.company;

public class Employee1 {
}
class Employee
{
   double hourlyrate;
   double bonus;
   int hoursworked;
   int overtime;
   int emp_id;
   String name;
   public double callWages()
   {
    return hourlyrate*hoursworked;
   }
   public double callWages(int overtime)
   {
       return (hoursworked+overtime)*hourlyrate;
   }
   public void callWages(int overtime,double bonus)
   {

   }
}
