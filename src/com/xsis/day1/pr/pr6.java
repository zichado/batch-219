package com.xsis.day1.pr;

import java.util.Scanner;

public class pr6 {
    public static void main(String[] args) {
        int jumlahUang, sisa, bagi1, bagi2, bagi3, bagi4;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan jumlah uang $ = ");
        jumlahUang = scan.nextInt();

        bagi1 = jumlahUang / 20;
        sisa = jumlahUang % 20;
        System.out.println(bagi1 + " lembar $20");

        bagi2 = sisa / 10;
        sisa = sisa % 10;
        System.out.println(bagi2 + " lembar $10");

        bagi3 = sisa / 5;
        sisa = sisa % 5;
        System.out.println(bagi3 + " lembar $5");

        bagi4 = sisa / 1;
        System.out.println(bagi4 + " lembar $1");
    }
}