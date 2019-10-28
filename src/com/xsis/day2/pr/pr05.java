package com.xsis.day2.pr;

import java.util.Scanner;

public class pr05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.print("Masukan nilai pertama = ");
        a = scan.nextInt();
        System.out.print("Masukan nilai kedua = ");
        b = scan.nextInt();

        if(a>b){
            System.out.println(b +" lebih kecil dari "+a);
        }else{
            System.out.println(a+" lebih kecil dari "+b);
        }
    }
}
