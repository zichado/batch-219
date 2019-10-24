package com.xsis.day1;

import java.util.Scanner;

public class practise08 {
    public static void main(String[] args) {
        double itemBeforeDiscount, discount, itemAfterDiscount;
        Scanner scan = new Scanner(System.in);
        System.out.println("Harga Item = ");
        itemBeforeDiscount = scan.nextDouble();
        System.out.println("Diskon % = ");
        discount = scan.nextDouble();
        itemAfterDiscount = itemBeforeDiscount - (itemBeforeDiscount * discount / 100);
        System.out.println("Harga setelah diskon ="+itemAfterDiscount);

    }
}
