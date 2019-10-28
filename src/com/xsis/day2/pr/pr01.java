package com.xsis.day2.pr;

import java.util.Scanner;

public class pr01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a;

        System.out.println("Masukan Bilangan = ");
        a = scan.nextInt();

        if (a%6 ==0 && a!=0){
            System.out.println("Kelipatan 6");
        }else{
            System.out.println("bukan kelipatan 6");
        }
    }
}
