package com.company;

import javax.management.ListenerNotFoundException;

public class Main {

    public static void main(String[] args) {
        System.out.print("\nCalculating the area and volume of squares\n");
        System.out.print("int a=3; \nV=a*a*a; \nV=3*3*3 \nV=27;\n");

        String bookname = "The Little Prince" ;
        String authorname = "Antoine de Saint-Exupéry" ;

        System.out.println("\nBook name " + bookname + " - " + "Author name " + authorname);


        String numString = "123";
        String string = "One Two Three";
        System.out.println(Integer.parseInt(numString));


        try {
            System.out.println(Integer.parseInt(string));
        } catch (NumberFormatException e) {
            System.out.println("Isn't a number.\n");
        }

        //second variant
        System.out.println(Character.isDigit(numString.charAt(0)));
        System.out.println(Character.isDigit(numString.charAt(1)));
        System.out.println(Character.isDigit(numString.charAt(2)));


        System.out.println();

        System.out.println(Character.isDigit(string.charAt(0)));
        System.out.println(Character.isDigit(string.charAt(1)));
        System.out.println(Character.isDigit(string.charAt(2)));
    }
}
