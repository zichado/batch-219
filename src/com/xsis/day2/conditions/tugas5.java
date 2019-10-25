package com.xsis.day2.conditions;

import java.util.Scanner;

public class tugas5 {
    public static void main(String[] args) {
        int n1, n2, n3, n4;
        Scanner scan = new Scanner(System.in);
        System.out.println("angka 1 =");
        n1 = scan.nextInt();
        System.out.println("angka 2 =");
        n2 = scan.nextInt();
        System.out.println("angka 3 =");
        n3 = scan.nextInt();
        System.out.println("angka 4 =");
        n4 = scan.nextInt();

        if(n1>0 && n2>0 && n3>0 && n4>0){
            System.out.println("positif");
        }else{
            System.out.println("ada bilangan negatif yang diinputkan");
        }
    }
}
