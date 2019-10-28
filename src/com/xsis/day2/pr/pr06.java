package com.xsis.day2.pr;

import java.util.Scanner;

public class pr06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.println("Masukan sisi pertama = ");
        a = scan.nextInt();
        System.out.println("Masukan sisi kedua = ");
        b = scan.nextInt();
        System.out.println("Masukan sisi ketiga = ");
        c = scan.nextInt();

        if (a < (b + c)) {
            System.out.println(a + " Bisa menjadi panjang sisi segitiga");
        } else if (b < (a + c)) {
            System.out.println(b + " Bisa menjadi panjang sisi segitiga");
        } else if (c < (a + b)) {
            System.out.println(c + " Bisa menjadi panjang sisi segitiga");
        }else{
            System.out.println("Tidak bisa menjadi panjang sisi segitiga");
        }
    }
}