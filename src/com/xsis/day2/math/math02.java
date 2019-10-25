package com.xsis.day2.math;

import java.util.Scanner;

public class math02 {
    public static void main(String[] args) {
        double s, a, t;
        Scanner io = new Scanner(System.in);
        System.out.println("Jarak = ");
        s = io.nextDouble();

        System.out.println("Percepatan = ");
        a = io.nextDouble();

        t = Math.sqrt((2*s)/a);
        System.out.println("Waktu = " +t);
        // dibulatkan keatas
        System.out.println("Waktu dibulatkan = "+Math.round(t));
        // dibulatkan kebawah
        System.out.println("Waktu dibulatkan = "+Math.floor(t));
    }
}
