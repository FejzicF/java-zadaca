package com.company;

public class Main {

    public static void main(String[] args) {
double A = 16.3;
        System.out.println("Vrijednost variable A" + A);
        System.out.println("Zaokruzena vrijednos var A" + Math.ceil(A));
        int A1 =(int) (Math.random()* 99 + 1);
        int B = (int) (Math.random()* 99 + 1);
        int C = (int) (Math.random()* 99 + 1);
        System.out.println("Random vrijednost"+A1);
        System.out.println("Random vrijednost" +B);
        System.out.println( "Random vrijednost"+C);
        int max = Math.max(Math.max(A1,B), C);
        int min = Math.min(Math.min(A1,B), C);
            System.out.println("Najveca vrijednost" + max);
            System.out.println("Najmanja vrijednost" + min);
            System.out.println("Korijen max varijable" + Math.pow(max,2));
            System.out.println("Kvadrat min varijable" + Math.pow(min,2));




    }
}
