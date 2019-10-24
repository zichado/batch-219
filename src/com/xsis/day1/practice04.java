package com.xsis.day1;
// menghitung luas lingkaran
/* rumus luas lingkaran
* luas = pi *(r*r)
* pi = 3.14
 */

import java.util.Scanner;

public class practice04 {
    // deklarasikan variabel pi menjadi static
    // variabel agar bisa diakses main
    static final double pi = 3.14;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double luas, jari;
        System.out.print("jari-jari = ");
        jari = scan.nextDouble();
        // menghitung luas lingkaran
        luas = pi * (jari*jari);
        System.out.println("Luas lingkaran"+luas);


    }
}
