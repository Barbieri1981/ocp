package org.packages;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class StaticTypeImport {
    public static void main(String[] args) {
        double radius = 5;
        double circumference = 2 * PI * radius; // Directly use PI
        System.out.println(circumference);
        double area = PI * radius * radius;
        double root = sqrt(area); // Directly use sqrt
        System.out.println(root);
    }
}
