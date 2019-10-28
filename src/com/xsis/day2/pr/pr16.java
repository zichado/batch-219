package com.xsis.day2.pr;

import java.util.Scanner;

public class pr16 {
    public static void main(String[] args) {
        int nilai;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan nilai = ");
        nilai = scan.nextInt();

        if(nilai >= 90 && nilai <= 100){
            System.out.println("A");
        }else if(nilai >= 80 && nilai < 90){
            System.out.println("B");
        }else if(nilai >= 70 && nilai < 80){
            System.out.println("C");
        }else if(nilai >= 60 && nilai < 70){
            System.out.println("D");
        }else{
            System.out.println("E/F");
        }
    }
}
