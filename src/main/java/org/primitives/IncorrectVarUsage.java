package org.primitives;

import java.util.ArrayList;

public class IncorrectVarUsage {

    // var globalVar = "This is not allowed";

    public static void main(String[] args) {
        // Correct usage for comparison:
        var list = new ArrayList<String>();

        // Cannot use 'var' without an initializer.
        // var emptyDeclaration;

        // Cannot use 'var' when initializing with null because the type cannot be inferred.
        // var nullVar = null;

        // Cannot use 'var' for method parameters.
        // public void print(var param) { }

        // Cannot use 'var' for return types.
        // public var getSomething() { return "test"; }




        // Correct use inside the loop for local variable
        for (var i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // Using 'var' with array initializer without new keyword is not allowed.
        // var numbers = {1, 2, 3};
        var numbers = new int[]{1, 2, 3};

        // 'var' cannot be used if it leads to ambiguity. For example, with diamond operator without type.
        // var ambiguousVar = new ArrayList<>();
        var specificVar = new ArrayList<String>(); // Correct: Type is specified with diamond operator.
    }
}
