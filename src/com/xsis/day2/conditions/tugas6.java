package com.xsis.day2.conditions;

import java.util.Scanner;

public class tugas6 {
    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.println("masukan angka pertama = ");
        a= scan.nextInt();
        System.out.println("masukan angka kedua = ");
        b= scan.nextInt();

        if(a>b){
            System.out.println(b+" " +a);
        }else{
            System.out.println(a+" "+b);
        }
    }
}
