package com.xsis.day1;

import java.util.Scanner;

public class practise12 {
    public static void main(String[] args) {
        int bilangan, digit1, digit2, digit3, digit4, sisa, totalJumlah;
        Scanner scan = new Scanner(System.in);
        System.out.println("masukan bilangan = ");
        bilangan = scan.nextInt();

        digit1 = (int)bilangan /1000;
        sisa = (int)bilangan % 1000;
        System.out.println("digit 1 = "+digit1+", sisa = "+sisa);

        digit2 = (int)sisa /100;
        sisa = (int)sisa % 100;
        System.out.println("digit 2 = "+digit2+", sisa = "+sisa);

        digit3 = (int)sisa /10;
        sisa = (int)sisa % 10;
        System.out.println("digit 3 = "+digit3+", sisa = "+sisa);

        digit4 = (int)sisa;
        sisa= (int)sisa % 1;
        System.out.println("digit 4 = "+digit4+", sisa = "+sisa);

        totalJumlah = digit1+digit2+digit3+digit4;
        System.out.println("toala jumlah digit ="+totalJumlah);


    }
}
