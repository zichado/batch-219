package com.xsis.day2.conditions;

import java.util.Scanner;

public class if07 {
    static final String IS_NUMERIC = "[-+]?\\d+(\\.\\d+)?";
    public static void main(String[] args) {
        String quantityStr;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Bilangan = ");
        quantityStr = scan.next();
        if (quantityStr.matches(IS_NUMERIC)){
            System.out.println("Inputan bilangan numerik");
        }else{
            System.out.println("Inputan bukan bilangan numerik");
        }

    }
}
