package com.xsis.day2.pr;

import java.util.Scanner;

public class pr10 {
    final static double pajak = .3;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double gaji, jam, total1, total2;
        System.out.println("Masukan gaji per jam = ");
        gaji = scan.nextDouble();

        System.out.println("Masukan jumlah jam kerja = ");
        jam = scan.nextDouble();
total1 = gaji*jam;
total2 = (gaji*jam) + (jam%40*gaji);
        if (jam <= 40) {
            System.out.println("Gaji kotor = " + (total1-(total1*pajak)));
        } else {
            System.out.println("Gaji kotor = " + (total2-(total2*pajak)));
        }
    }
}