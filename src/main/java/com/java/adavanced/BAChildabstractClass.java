package com.java.adavanced;

public class BAChildabstractClass extends aircraftAbstractClass {

    public static void main(String[] args) {

        aircraftAbstractClass abc = new BAChildabstractClass();

        abc.color();
        abc.engineChoice();
        abc.configuration();
    }

    @Override
    public void color() {
        // TODO Auto-generated method stub
        System.out.println("The choosen color is red and white combo");

    }

    private void sysout(String string) {
    }

}
