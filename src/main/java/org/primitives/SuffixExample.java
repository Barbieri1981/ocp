package org.primitives;

public class SuffixExample {
    public static void main(String[] args) {

        // Using float suffix (F) for a floating-point number
        float piApproximation = 3.14F; // Without the F suffix, it would be treated as a double, using more memory than necessary for this level of precision.

        double precisePi = 3.141592653589793D; // D suffix is optional here, as the literal is treated as double by default, but it's used for clarity.
    }
}
