package com.xsis.day1.quiz;

import java.util.Scanner;

public class logic7 {
    static final double pajak = .2;

    public static void main(String[] args) {
        double harga, hargaPajak, hargaRata;
        Scanner scan = new Scanner(System.in);
        System.out.println("Harga barang = ");
        harga = scan.nextDouble();
        hargaPajak = harga + (harga * pajak);
        System.out.println("Harga pajak = " + hargaPajak);
        hargaRata = (harga + hargaPajak) / 2;
        System.out.println("Harga Rata = " + hargaRata);
    }
}