package com.xsis.day2.pr;

import java.util.Scanner;

public class pr02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.println("Masukan bilangan = ");
        a = scan.nextInt();

        if (a%6 ==0 && a%7 ==0){
            System.out.println("Kelipatan 6 atau kelipatan 7");
        }else{
            System.out.println("Bukan Kelipatan 6 atau kelipatan 7");
        }
    }
}
