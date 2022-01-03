package com.java.adavanced;

public class constructorClass {
    // this is nonparameterized constructor
    public constructorClass() {
        System.out.println("This is constructor method");
    }
    // this is parmeterized constructor

    public constructorClass(int a, int b) {
        System.out.println(a + b);
    }

    public void getDummyData() {
        System.out.println("This is a dummy data inside construtor");
    }

    public static void main(String[] args) {

        constructorClass cc = new constructorClass(2, 3);
        constructorClass noncc = new constructorClass();
        cc.getDummyData();
    }

}
