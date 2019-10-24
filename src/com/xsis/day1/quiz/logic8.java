package com.xsis.day1.quiz;

import java.util.Scanner;

public class logic8 {
    public static void main(String[] args) {
        double hargaAwal, discount, hargaTotal;
        Scanner scan = new Scanner(System.in);
        System.out.println("Harga Item = ");
        hargaAwal =scan.nextDouble();
        System.out.println("Diskon % = ");
        discount =scan.nextDouble();
        hargaTotal = hargaAwal -(hargaAwal *discount /100);
        System.out.println("Harga setelah diskon ="+hargaTotal);

    }

}