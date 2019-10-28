package com.xsis.day2.pr;

import java.util.Scanner;

public class pr22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pilih;
        System.out.println("Pilihan :");
        System.out.println("M for Motorcycle");
        System.out.println("C for Car");
        System.out.println("T for Truck");
        System.out.println("Masukan pilihan anda (m/c/t) =");
        pilih = scan.nextLine();

        switch (pilih){
            case "m":
            System.out.println("$1");
            break;
            case "c":
            System.out.println("$2");
            break;
            case "t":
            System.out.println("$4");
            break;
        }
    }
}