package com.xsis.day2.pr;

import java.util.Scanner;

public class pr04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.print("Masukan bilang = ");
        a = scan.nextInt();

        if(a>=1000 && a<=9999){
            System.out.println("Bilangan bulat empat digit");
        }else{
            System.out.println("Bukan bilangan bulat empat digit");
        }
    }
}
