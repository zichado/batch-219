package com.xsis.day2.pr;

import java.util.Scanner;

public class pr14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bulan;
        System.out.println("Masukan bulan = ");
        bulan=scan.nextInt();
        if(bulan ==12 || bulan ==1 || bulan ==2){
            System.out.println("Musim Winter");
        }else if(bulan ==3 || bulan ==4 || bulan ==5){
            System.out.println("Musim Spring");
        }else if(bulan ==6 || bulan ==7 || bulan ==8){
            System.out.println("Musim Summer");
        }else{
            System.out.println("Musim Autumn");
        }
    }
}
