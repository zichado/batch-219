package com.xsis.day2.pr;

import java.util.Scanner;

public class pr20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pin = 12345, b1, b2, b3, sisa;
        System.out.print("Masukan pin anda = ");
        pin = scan.nextInt();

        if (pin != 12345) {
            System.out.print("Pin Salah, masukan Pin lagi = ");
            pin = scan.nextInt();
            if (pin != 12345) {
                System.out.print("Pin Salah, masukan Pin lagi = ");
                pin = scan.nextInt();
                if (pin != 12345) {
                    System.out.print("Pin Salah, masukan Pin lagi = ");
                    pin = scan.nextInt();
                }else{
                    System.out.println("Pin yang anda masukan Salah");
                }
            }
        }
    }
}

