package com.xsis.day2.pr;

import java.util.Scanner;

public class pr07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c;
        System.out.print("Masukan bilangan pertama = ");
        a = scan.nextDouble();

        System.out.print("Masukan bilangan kedua = ");
        b = scan.nextDouble();

        System.out.print("Masukan bilangan ketiga = ");
        c = scan.nextDouble();

        if (a == Math.sqrt(Math.pow(c, 2) + Math.pow(b, 2))) {
            System.out.println(a + " Bisa panjang dari sisi segitiga siku-siku ");
        } else if (b == Math.sqrt(Math.pow(c, 2) + Math.pow(a, 2))) {
            System.out.println(b + " Bisa panjang dari sisi segitiga siku-siku  ");
        } else if (c == Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2))) {
            System.out.println(c + " Bisa panjang dari sisi segitiga siku-siku  ");
        }
    }
}
