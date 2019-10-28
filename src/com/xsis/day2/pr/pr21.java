package com.xsis.day2.pr;

import java.util.Scanner;

public class pr21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilih,liter,rl, galon,rg;
        System.out.println("Pilihan :");
        System.out.println("1. Konvert Galon ke Liter");
        System.out.println("2. Konvert Liter ke Galon");
        System.out.println("Masukan pilihan =");
        pilih= scan.nextInt();

        if(pilih == 1 ){
            System.out.print("Masukan jumlah galon = ");
            galon = scan.nextInt();
            rl = galon*3785;
            System.out.println(+rl+" liter");
        }else{
            System.out.print("Masukan jumlah liter = ");
            liter = scan.nextInt();
            rg = liter/3785;
            System.out.println(+rg+" galon"+(liter%3785)+" liter");
        }
    }
}
