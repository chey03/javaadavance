package com.java.adavanced;

public class thisClass {

    int a = 33;

    public void getIntgvalue() {
        int a = 44;
        // System.out.println("The value of a is :" + a);
        // to access the value of a defined at class level we can use "this" key word

        System.out.println("The value of a is :" + this.a);
        System.out.println(this.a + a);
    }

    public static void main(String[] args) {

        thisClass tc = new thisClass();

        tc.getIntgvalue();
    }

}
