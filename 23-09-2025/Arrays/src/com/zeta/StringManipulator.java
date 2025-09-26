package com.zeta;

public class StringManipulator {
    public static void main(String[] args) {
        String str1 = "Being Consistent is always better than perfection";
        System.out.println(str1);

        char ch = str1.charAt(3);
        System.out.println(ch);

        int len = str1.length();
        System.out.printf("The Length of the String str1 is %s%n", len);

        String strLower = str1.toLowerCase();
        System.out.printf("The String str1 is %s%n", strLower);

        String strUpper = str1.toUpperCase();
        System.out.printf("The String str1 is %s%n", strUpper);

        System.out.println(str1);
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1);


        String str2 = "Hello";
        String str3 = "Hello";

        if (str2 == str3) { // This checks with the same objects not same data in the strings
            System.out.println("Both Strings are referring to the same object");
        } else  {
            System.out.println("Both are not referring to the same object");
        }

        String str4="";
        System.out.println("Length " + str4.length());

        String mystr = "hello";
        mystr = null;
        System.out.println(mystr);
//        System.out.println(mystr.length()); //NullPointerException we are trying to access pointer which is null


        String string1= new String("Hello");
        String string2= new String("Hello");

        if (string1 == string2) {
            System.out.println("Both Strings are referring to the same object");
        }  else  {
            System.out.println("Both are not referring to the same object");
        }

        if (string1.equals(string2)) {
            System.out.println("Both Strings are referring to the same data");
        }  else  {
            System.out.println("Both are not referring to the same data");
        }

    }
}
