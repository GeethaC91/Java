package com.company;
public class CalculatorOver {
    String type;
    public CalculatorOver(String type)
    {
        this.type = type;
    }
    public int sum(int a, int b) {
        return a + b;}
    public int sum(int a, int b, int c) {
        return a + b + c;}
    public double sum(double a, double b) {
        return a + b;}
    public long sum(int a, long b) {
        return a + b;}
    public int multiply(int a, int b) {
        return a*b;}
    public int multiply(int a, int b,int c) {
        return a*b*c;}
    public double multiply(double a, double b) {
        return a * b;}

    public static void main(String[] args) {
       // CalculatorOver c=new CalculatorOver();
       // c.sum(1,2);
    }
}




