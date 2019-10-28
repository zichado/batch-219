package com.xsis.day2.pr;

import java.util.Scanner;

public class pr08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c, r;
        System.out.print("Loncatan Pertama = ");
        a= scan.nextDouble();

        System.out.print("Loncatan kedua = ");
        b= scan.nextDouble();

        System.out.print("Loncatan ketiga = ");
        c= scan.nextDouble();

        r= (a+b+c)/3;
        System.out.println("Rata-rata Loncatan = "+r);

        if(r>=8){
            System.out.println("Berkualitas");
        }else{
            System.out.println("Didiskualifikasi");
        }
    }
}
