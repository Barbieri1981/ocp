package org.primitives;

public class WideningConversion {
    public static void main(String[] args) {
        int myInt = 100;
        long myLong = myInt; // Widening from int to long
        float myFloat = myLong; // Widening from long to float
        System.out.println(myLong);
        System.out.println(myFloat);
    }
}
