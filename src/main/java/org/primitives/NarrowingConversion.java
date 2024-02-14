package org.primitives;

public class NarrowingConversion {
    public static void main(String[] args) {
        double myDouble = 9.78;
        int myInt = (int) myDouble; // Narrowing from double to int
        System.out.println(myDouble);
        System.out.println(myInt);
    }
}
