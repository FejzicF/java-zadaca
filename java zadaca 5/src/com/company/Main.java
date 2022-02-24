package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 9;
        int b = 15;

        System.out.println("Početna vrijednost varijable a je: " +a);
        a +=10;
        System.out.println("Vrijednost varijable a nakon dodavanja 10 je: " +a);
        a -=4;
        System.out.println("Vrijednost varijable a nakon oduzimanja 4 je: " +a);
        a /=3;
        System.out.println("Vrijednost varijable a nakon dijeljenja sa 3 je: " +a);
        a*=2;
        System.out.println("Vrijednost varijable a nakon množenja sa 2 je: " +a);
        a%=7;
        System.out.println("Vrijednost varijable a nakon modula od 7 je: " +a);


        System.out.println("\nPočetna vrijednost varijable b je: " +b);
        b += 6;
        System.out.println("Vrijednost varijable b nakon dodavanja 6 je: " +b);
        b -=4;
        System.out.println("Vrijednost varijable b nakon oduzimanja 4 je: " +b);
        b /=3;
        System.out.println("Vrijednost varijable b nakon dijeljenja sa 3 je: " +b);
        b*=3;
        System.out.println("Vrijednost varijable b nakon množenja sa 3 je: " +b);
        b%=7;
        System.out.println("Vrijednost varijable b nakon modula od 7 je: " +b);

        System.out.println("*********************");

        String stringText = "Nesto jednostavno ya paksu";


        System.out.println("Before using arithmetic operator: " + stringText);
       stringText += 2;
        System.out.println("After using arithmetic operator: " + stringText);
       stringText += " and 5.";
        System.out.println("After using arithmetic(concatenation) operator: " + stringText);
    }
}
