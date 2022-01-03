package com.java.adavanced;

public class exceptionDemo {

    int a = 2;
    int b = 0;
    float c;

    public float getDiv() {
        try {
            c = a / b;
            int a[] = new int[5];
            System.out.println(a[7]);

            // one try can have multiple catchblocks

        } catch (IndexOutOfBoundsException ie) {
            System.out.println("array out of exception");
        } catch (ArithmeticException ae) {
            System.out.println("Arthemitic exception");
        } catch (Exception e) {
            System.out.println("Check the zero values passed into integers");
        }

        // finally irrespective of exceptions is thrown or not and in order to execute
        // we must have try block

        finally {
            System.out.println("This block executes irrespetcive of exceptiions");

        }
        return c;

    }

    public static void main(String[] args) {

        exceptionDemo ed = new exceptionDemo();
        System.out.println(ed.getDiv());
        // System.out.print(ed.getDiv());
    }
}
