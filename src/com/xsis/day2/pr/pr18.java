package com.xsis.day2.pr;

import java.util.Scanner;

public class pr18 {
    public static void main(String[] args) {
        int jumlah;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan jumlah cd = ");
        jumlah = scan.nextInt();

        if(jumlah == 1){
            System.out.println("mendapatkan 3 Point");
        }else if(jumlah == 2) {
            System.out.println("mendapatkan 10 Point");
        } else if(jumlah == 3) {
            System.out.println("mendapatkan 20 Point");
        }else if(jumlah == 4){
            System.out.println("mendapatkan 45 Point");
        }else{
            System.out.println("Jumlah Invalid");
            }
    }
}