package com.xsis.day2.pr;

import java.util.Scanner;

public class pr11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kec;
        System.out.println("Masukan total kecepatan = ");
        kec = scan.nextInt();

        if(kec<6000){
            System.out.println("setelah "+(6000-kec)+" mil lakukan Layanan Umum");
        }else{
            System.out.println("setelah "+(12000-kec)+" mil lakukan layanan Utama");
        }

    }
}
