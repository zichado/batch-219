package com.xsis.day1.pr;

import java.util.Scanner;

public class pr5 {
    public static void main(String[] args) {
        int waktu, sisa, week, day, hour, minute, second, hasil;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan waktu = ");
        waktu = scan.nextInt();

        week = waktu / 604800;
        sisa = waktu % 604800;
        System.out.println(week+" week");

        day = sisa / 86400;
        sisa = sisa % 86400;
        System.out.println(day+" day");

        hour = sisa / 3600;
        sisa = sisa % 3600;
        System.out.println(hour+" hour");

        minute = sisa / 60;
        sisa = sisa % 60;
        System.out.println(minute+" minute");

        second = sisa / 1;
        System.out.println(second+" second");
    }
}
