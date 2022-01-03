package com.java.adavanced;

public class childInteface1 implements BaseInterface {
    /**
     *
     */
    // private static final String IT_S_RED_PLEASE_HALT = "It's red please halt";

    public static void main(String[] args) {

        BaseInterface cinf = new childInteface1();

        cinf.amber();
        cinf.green();
        cinf.red();

    }

    @Override
    public void green() {
        // TODO Auto-generated method stub
        System.out.println("It's green let's go \t" + country);
    }

    @Override
    public void red() {
        // TODO Auto-generated method stub
        System.out.println("IT_S_RED_PLEASE_HALT");

    }

    @Override
    public void amber() {
        // TODO Auto-generated method stub
        System.out.println("Watch carefully");

    }

}
