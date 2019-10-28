package com.xsis.day2.pr;

import java.util.Scanner;

public class pr17 {
    static final String IS_NUMERIC = "[-+]?\\d+(\\.\\d+)?";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String bilangan;
        System.out.println("Masukan bilangan = ");
        bilangan = scan.next();

        if (bilangan.matches(IS_NUMERIC)) {
            System.out.println("Bilangan dapat dibagi 5 atau 8");
            } else {
                System.out.println("bukan bilangan numerik");
            }
        }
    }

