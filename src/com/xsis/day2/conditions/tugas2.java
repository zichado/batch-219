package com.xsis.day2.conditions;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan bilangan pertama = ");
        a= scan.nextInt();
        System.out.println("Masukan bilangan kedua = ");
        b= scan.nextInt();

        if (a>0 && b>0){
            System.out.println("Positif");
        }else{
            System.out.println(" ada yang negatif");
        }
    }
}
