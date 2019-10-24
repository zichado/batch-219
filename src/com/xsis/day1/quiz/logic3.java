package com.xsis.day1.quiz;

import java.util.Scanner;

public class logic3 {
    static final double pajak = .07;
    static final double tips = .1;

    public static void main(String[] args) {
        double hargaSebelum, totalTagihan;
        Scanner scan = new Scanner(System.in);
        System.out.println("Harga barang = ");
        hargaSebelum = scan.nextDouble();
       totalTagihan = hargaSebelum + (hargaSebelum*pajak)+(hargaSebelum*tips);
        System.out.println("Total harga = "+totalTagihan);
    }
}
