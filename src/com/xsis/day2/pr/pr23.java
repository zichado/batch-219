package com.xsis.day2.pr;

import java.util.Scanner;

public class pr23 {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int berat1, berat2, berat3;
        System.out.println("Masukan berat orang pertama = ");
        berat1 = scan.nextInt();
        System.out.println("Masukan berat orang kedua = ");
        berat2 = scan.nextInt();
        System.out.println("Masukan berat orang ketiga = ");
        berat3 = scan.nextInt();

        if(berat1>berat2 && berat1>berat3){
            System.out.println("Orang pertama adalah oraang terberat");
        }else if(berat2>berat1 && berat2>berat3){
            System.out.println("Orang kedua adalah orang terberat");
        }else if(berat3>berat1 && berat3>berat2){
            System.out.println("Orang ketiga adalah orang terberat");
        }

    }
}
