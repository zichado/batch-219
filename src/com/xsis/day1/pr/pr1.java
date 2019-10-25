package com.xsis.day1.pr;

import java.util.Scanner;

public class pr1 {
    public static void main(String[] args) {
        int bilangan, digitAkhir, hasil;
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukan bilangan =");
        bilangan= scan.nextInt();
        digitAkhir= (int)bilangan % 10;
        System.out.println(" digit akhir = "+digitAkhir);
        hasil = digitAkhir * 8;
        System.out.println("hasil ="+hasil);
    }
}
