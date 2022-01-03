package com.java.adavanced;

public class accessModifiers {

    String Street;
    String City;
    int Pincode;
    static String country = "India";

    public accessModifiers(String Street, String City, int Pincode) {

        this.City = City;
        this.Street = Street;
        this.Pincode = Pincode;

    }

    public String getStreet() {
        return Street + " " + country;
    }

    public static void main(String[] args) {

        accessModifiers am = new accessModifiers("Kormangala", "Bangalore", 560100);

        accessModifiers am1 = new accessModifiers("Ponamalee", "Chennai", 60610);

        System.out.println(am.getStreet());
        System.out.println(am1.getStreet());
    }

}
