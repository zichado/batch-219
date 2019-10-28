package com.xsis.day2.pr;

import java.util.Scanner;

public class pr09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bayar, jam, gaji, gajiLembur;
        System.out.print("Masukan bayaran per Jam = ");
        bayar= scan.nextInt();

        System.out.print("Masukan jumlah jam kerja = ");
        jam= scan.nextInt();

        if(jam<=40){
            gaji= jam*bayar;
            System.out.println("Gaji kotor = "+gaji);
        }else{
            gajiLembur = (jam*bayar+jam%40*bayar);
            System.out.println("Gaji kotor = "+gajiLembur);
        }
    }
}
