package com.xsis.day2.conditions;

import java.util.Scanner;

public class if03 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input bilangan = ");
        n = scan.nextInt();

        if (n%2 ==0){
            System.out.println("genap");
        }else{
            System.out.println("ganjil");
        }

    }
}
