package com.xsis.day2.pr;

import java.util.Scanner;

public class pr12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double waktu1, jarak1, kecepatan1, waktu2, jarak2, kecepatan2, m1, m2;

        // mobil A
        System.out.print("Masukan Waktu perjalanan mobil A = ");
        waktu1= scan.nextDouble();
        System.out.print("Masukan jarak yang ditempuh mobil A = ");
        jarak1= scan.nextDouble();
        System.out.print("Masukan kecepatan mobil A = ");
        kecepatan1= scan.nextDouble();
        m1= kecepatan1 + (jarak1/2 * Math.pow(waktu1,2));
        System.out.println("Jarak yang ditempuh mobil A = " +m1);


        // mobil B
        System.out.print("Masukan Waktu perjalanan mobil B = ");
        waktu2= scan.nextDouble();
        System.out.print("Masukan jarak yang ditempuh mobil B = ");
        jarak2= scan.nextDouble();
        System.out.print("Masukan kecepatan mobil B = ");
        kecepatan2= scan.nextDouble();
        m2= kecepatan2 + (jarak2/2 * Math.pow(waktu2,2));
        System.out.println("Jarak yang ditempuh mobil B = " +m2);





        if(m1>m2){
            System.out.println("Mobil A Didepan");
        }else {
            System.out.println("Mobil B Didepan");
        }
    }
}
