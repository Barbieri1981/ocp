package org.string;

public class Immutability {
    public static void main(String[] args) {
        String original = "Java";
        original.concat(" Programming");
        System.out.println(original);
        String modified = original.concat(" Programming");
        original = modified;
        System.out.println(original);
    }
}
