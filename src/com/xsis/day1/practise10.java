package com.xsis.day1;
// menghitung luas segitiga
/* deklarasi static final double untuk 1/2
* variabel
* rumus = 1/2 *a*t
 */
import java.util.Scanner;

public class practise10 {
    static final double kl=.5;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double alas, tinggi, luas;

        System.out.println("Masukan alas = ");
        alas = scan.nextDouble();
        System.out.println("Masukan tinggi =");
        tinggi = scan.nextDouble();
        luas = kl * alas * tinggi;
        System.out.println("Luas Lingkaran =" +luas);

    }
}
