package org.primitives;

public class Variables {
    int instanceVar; // Automatically initialized to 0
    static int staticVar;

    public static void main(String[] args) {
        Variables variables = new Variables();
        System.out.println(variables.instanceVar);
        System.out.println(staticVar);

        int localVar; // Must be initialized before use
        // System.out.println(localVar); // This would cause a compile-time error
        localVar = 10; // Now it's initialized
        System.out.println(localVar); // This is fine
    }


}