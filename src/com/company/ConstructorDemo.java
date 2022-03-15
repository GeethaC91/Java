package com.company;

public class ConstructorDemo {
    private String name;
    private int age;

    public ConstructorDemo(String name)
    {
        this.name=name;
    }

    public ConstructorDemo(int age) {
        this.age = age;
    }
    public ConstructorDemo()
    {
        this("Geetha");
    }

    public static void main(String[] args) {
        ConstructorDemo cd = new ConstructorDemo();
        System.out.println(cd.name);
    }
}
