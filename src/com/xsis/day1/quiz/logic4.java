package com.xsis.day1.quiz;

import java.util.Scanner;

public class logic4 {
    static final double a = 32;
    static final double b = 1.8;

    public static void main(String[] args) {
        double farenheit, celcius;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Farenheit = ");
        farenheit = scan.nextDouble();
        celcius = (farenheit - a) / b;

        System.out.println("celcius = " + celcius);
    }
}