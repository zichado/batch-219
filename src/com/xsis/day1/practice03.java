package com.xsis.day1;
import java.util.Scanner;
public class practice03 {
    public static void main(String[] args) {
        // hitung luas persegi panjang
        Scanner scan = new Scanner(System.in);
        int panjang=0, lebar=0, luas;

        System.out.println("panjang :");
        panjang = scan.nextInt();
        System.out.println("Lebar");
        lebar = scan.nextInt();
        luas = panjang * lebar;

        System.out.println("Luas persegi panjang ="+luas);
    }
}
