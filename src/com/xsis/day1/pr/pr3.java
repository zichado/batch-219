package com.xsis.day1.pr;

import java.util.Scanner;

public class pr3 {
    public static void main(String[] args) {
        int bilangan, hasil;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan bilangan =");
        bilangan = scan.nextInt();
        hasil = bilangan % 2;
        System.out.println("hasil = "+hasil);
        
    }


}
