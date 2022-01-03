package com.java.adavanced;

public class childInheritanceclass extends ParentInheritanceclass {

    String cartype = "Electric";

    public static void main(String[] args) {
        childInheritanceclass pc = new childInheritanceclass();

        pc.bodytype();
        pc.cabinType();
        pc.tyreSize();
        pc.fuelType();
        System.out.println(pc.cartype);
        pc.carperference();
        pc.getCarType();

    }

    public void tyreSize() {
        System.out.println("Slected tyre size is r18");
    }

    public void carperference() {
        System.out.println(cartype);
    }

    public void getCarType()

    {
        // Use super key word to return the value set in parent class
        System.out.println("This will return the String value set in parent class: " + super.cartype);
    }

    public void fuelType() {
        // in order to refer the method of parent class just invoke the method using the
        // super key word
        super.fuelType();
        // here I've left the out put to prove it will also invoke additional logic inf
        // required
        System.out.println("Selected fuel type is Petrol");
    }

}
