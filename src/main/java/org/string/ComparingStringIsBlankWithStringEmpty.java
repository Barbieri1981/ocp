package org.string;

public class ComparingStringIsBlankWithStringEmpty {
    public static void main(String[] args) {
        String str1 = "";
        boolean result1 = str1.isEmpty();
        System.out.println(result1);

        String str2 = " ";
        boolean result2 = str2.isEmpty();
        System.out.println(result2);


        String str3 = " ";
        boolean result3 = str2.isBlank();
        System.out.println(result3);

    }
}
