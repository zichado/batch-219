package com.xsis.day2.conditions;

import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
String kalimat, b;
        Scanner scan = new Scanner(System.in);
        System.out.println("masukan kata = ");
        kalimat = scan.nextLine();
        b = kalimat.toUpperCase();

        if(kalimat.equals(b)){
            System.out.println("Huruf besar");
        }else{
            System.out.println("bukan huruf besar");
        }


    }
}
