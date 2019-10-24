package com.xsis.day1.quiz;

import java.util.Scanner;

public class logic6 {
    public static void main(String[] args) {
        double berat, tinggi, bmi;
        Scanner scan = new Scanner(System.in);
        System.out.println("berat =");
        berat = scan.nextDouble();
        System.out.println("tinggi =");
        tinggi = scan.nextDouble();


        bmi = berat / (tinggi*tinggi);
        System.out.println("bmi =" + bmi);
    }
}