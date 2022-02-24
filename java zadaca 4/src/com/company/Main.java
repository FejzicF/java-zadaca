package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String recenica1 = "Da li je ovo zanimljivo?";
        String [] recenica1niz = recenica1.split(" ");
        System.out.println(Arrays.toString(recenica1niz));


        double [] [] nizbr = {{2.6, 3.3, 4.4,},
                {5.9, 6.3, 7.7},
                {7.78, 8.5, 9.3}};
        double SUMkolone1 = nizbr[0][0]+nizbr[1][0]+nizbr[2][0];
        double SUMreda2 = nizbr[1][0]+nizbr[1][1]+nizbr[1][2];

        System.out.println("SUM koloneI" + SUMkolone1);
        System.out.println("SUM redaII"+ SUMreda2);
        System.out.println("SUM zajedno koloneI i redaII"+(SUMkolone1+SUMreda2));


    }
}
