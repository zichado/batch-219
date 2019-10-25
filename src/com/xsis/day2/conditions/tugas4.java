package com.xsis.day2.conditions;

import java.util.Scanner;

public class tugas4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String kalimat;
        System.out.println("masukan kata = ");
        kalimat = scan.nextLine();

        if (kalimat.length()>=20) {
            System.out.println("Many Character");
        } else {
            System.out.println("character");
        }
    }
}