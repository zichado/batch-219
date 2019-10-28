package com.xsis.day2.pr;

import java.util.Scanner;

public class pr03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.print("Masukan bilangan =");
        a = scan.nextInt();
        System.out.println("Bilangan yang dimasukan = "+a);
        if(a%4 ==0){
            System.out.println("Kelipatan 4");
            System.out.println(a+ " = " +a/4 +" x 4");
        }else{
            System.out.println("Bukan kelipatan 4");
            System.out.println(a+ " = " +a/4 + " x 4" +" + "+a%4);
        }
    }
}
