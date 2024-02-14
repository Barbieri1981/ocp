package org.packages;

public class FullyQualifiedClassName {
    public static void main(String[] args) {
        java.util.Date utilDate = new java.util.Date();
        System.out.println("java.util.Date: " + utilDate);

        long currentTime = System.currentTimeMillis();
        java.sql.Date sqlDate = new java.sql.Date(currentTime);
        System.out.println("java.sql.Date: " + sqlDate);
    }
}