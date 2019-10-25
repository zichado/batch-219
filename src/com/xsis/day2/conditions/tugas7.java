package com.xsis.day2.conditions;

import java.util.Scanner;

public class tugas7 {
    public static void main(String[] args) {
        int a, b, c;
        double r;
        Scanner scan = new Scanner(System.in);
        System.out.print("masukan suhu pertama = ");
        a = scan.nextInt();
        System.out.print("masukan suhu kedua = ");
        b = scan.nextInt();
        System.out.print("masukan suhu ketiga = ");
        c = scan.nextInt();
        r=(a+b+c)/3;

        if (r > 60) {
            System.out.println("Gelombang panas");
        } else {
            System.out.println("Gelombang adem");
        }
    }
}