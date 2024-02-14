package org.string;

public class Comparison {

    public static void main(String[] args) {
        literalsComparison();
        constructorsComparison();
        constructorsInternedComparison();
    }

    private static void literalsComparison() {
        String s1 = "Hello";
        String s2 = "Hello";
        // This prints true because s1 and s2 reference the same object in the string pool.
        System.out.println("String literals comparison using ==: " + (s1 == s2));
    }

    private static void constructorsComparison() {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        // This prints false because s1 and s2 are different objects in memory.
        System.out.println("String objects comparison using ==: " + (s1 == s2));
    }

    private static void constructorsInternedComparison() {
        String s1 = new String("Hello").intern();
        String s2 = new String("Hello").intern();
        // This prints true because, after interning, s1 and s2 reference the same object in the string pool.
        System.out.println("Interned string objects comparison using ==: " + (s1 == s2));
    }
}
