package com.xsis.day2.conditions;

import java.util.Scanner;

public class tugas01 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan bilangan = ");
        n = scan.nextInt();

        if(n>=0){
            System.out.println("positif");
        }else{
            System.out.println("negative");
        }
    }
}
