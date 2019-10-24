package com.xsis.day1.quiz;

import java.util.Scanner;

public class logic9 {
    final static double pajak=0.2;
    public static void main(String[] args) {
        double hari, kwh, totalKwh, tagihan, totalTagihan;
        totalKwh = 0;
        Scanner scan = new Scanner(System.in);
for (hari = 1; hari <31; hari++) {
    System.out.println("kwh hari ke-" + hari + " : ");
    kwh = scan.nextDouble();

    totalKwh = totalKwh + kwh;
}
tagihan = totalKwh * 15000;
        System.out.println("tagihan =" );
    totalTagihan = tagihan + (tagihan * 0.2);
}

}
