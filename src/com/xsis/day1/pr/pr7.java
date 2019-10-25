package com.xsis.day1.pr;

import java.util.Scanner;

public class pr7 {
    public static void main(String[] args) {
        int jumlahInches, sisa, mil, yard, feet, inches;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan jumlah inches = ");
        jumlahInches = scan.nextInt();

        mil = jumlahInches / 63360;
        sisa = jumlahInches % 63360;
        System.out.println(mil + " mil");

        yard = sisa / 36;
        sisa = sisa % 36;
        System.out.println(yard + " yards");

        feet = sisa / 12;
        sisa = sisa % 12;
        System.out.println(mil + " mil");

        inches = sisa / 1;
        System.out.println(inches + " inhces");
    }
}
