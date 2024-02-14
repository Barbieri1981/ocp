package org.packages;

import static java.lang.Math.*;

public class StaticTypeImportOnDemand {
    public static void main(String[] args) {
        double radius = 5;
        double circumference = 2 * PI * radius;
        System.out.println(circumference);
        double area = PI * radius * radius;
        double root = sqrt(area);
        System.out.println(root);
    }
}