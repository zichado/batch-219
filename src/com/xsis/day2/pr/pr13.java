package com.xsis.day2.pr;

import java.util.Scanner;

public class pr13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.println("Masukan bilangan = ");
        a = scan.nextInt();

        if(a>=100 && a <1000){
            System.out.println("Anda memasukan 3 digit angka");
        }else if (a>=10 && a<100){
            System.out.println("Anda memasukan 2 digit angka");
        }else{
            System.out.println("Anda memasukan 1 digit angka");
        }
    }
}
