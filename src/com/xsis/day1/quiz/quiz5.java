package com.xsis.day1.quiz;

import java.util.Scanner;

public class quiz5 {
    final static double a=.5;
    public static void main(String[] args) {
        double jarak, kecepatan, waktu;
        Scanner scan = new Scanner(System.in);
        System.out.println("kecepatan =");
        kecepatan = scan.nextDouble();
        System.out.println("waktu =");
        waktu = scan.nextDouble();


        jarak = a*kecepatan*waktu;
        System.out.println("jarak =" + jarak);
    }
}