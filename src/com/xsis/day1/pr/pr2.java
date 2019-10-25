package com.xsis.day1.pr;

import java.util.Scanner;

public class pr2 {
    public static void main(String[] args) {
        int bilangan, sisa, digit1, digit2, digit3, digit4, digit5, hasil;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan bilangan = ");
        bilangan = scan.nextInt();

        digit1 = (int)bilangan / 10000;
        sisa = (int)bilangan % 10000;
        System.out.println("digit 1 = "+digit1);

        digit2 = (int)sisa / 1000;
        sisa = (int)sisa % 1000;
        System.out.println("digit 2 = "+digit2);

        digit3 = (int)sisa / 100;
        sisa = (int)sisa % 100;
        System.out.println("digit 3 = "+digit3);

        digit4 = (int)sisa / 10;
        sisa = (int)sisa % 10;
        System.out.println("digit 4 = "+digit4);

        digit5 = (int)sisa / 1;
        sisa = (int)sisa % 1;
        System.out.println("digit 5 = "+digit5);

        hasil = (digit1*10000)+(digit2*1000)+(digit3*100)+(digit2*10)+(digit1*1);
        System.out.println("hasil kebalikan = "+hasil );
    }
}
