package com.xsis.day2.strings;

import java.util.Scanner;

public class string07 {
    public static void main(String[] args) {

        String userName, hasil;
        double a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan username = ");
        userName = scan.nextLine();
        a = 100*Math.random()+300;
        hasil = userName.substring(0,4);
        System.out.println("Hasil = " +hasil+Math.round(a));

    }
}
