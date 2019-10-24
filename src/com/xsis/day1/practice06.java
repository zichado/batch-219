package com.xsis.day1;

import java.util.Scanner;

public class practice06 {
    public static void main(String[] args) {
        double literPerKilo, totalJarakTempuh, totalLiter;
        Scanner scan = new Scanner(System.in);
        System.out.println("Total jarak =");
        totalJarakTempuh = scan.nextDouble();
        System.out.println("Total Bensin =");
        totalLiter = scan.nextDouble();

        //menghiung satu liter per kilo
        literPerKilo = totalJarakTempuh / totalLiter;
        System.out.println("Satu liter per kilo ="+literPerKilo);
    }
}
