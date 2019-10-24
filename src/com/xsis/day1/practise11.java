package com.xsis.day1;

import java.util.Scanner;

public class practise11 {
    final static double da= .2;
    final static double db= .5;
    final static double dc= 1.2;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
double x, hargaItem;
        x=0;
                if (x<=5){
                    System.out.println("Jumlah item =" +x);
                    hargaItem = x * da;
                    System.out.println("Harga item = "+hargaItem);
                }
                else if (x<=10){
                    System.out.println("Jumlah item =" +x);
                    hargaItem = x * db;
                    System.out.println("Harga item = "+hargaItem);
                }
                else if (x<=15){
                    System.out.println("Jumlah item =" +x);
                    hargaItem = x * dc;
                    System.out.println("Harga item = "+hargaItem);
                }
                else {
                    System.out.println("Jumlah produk tidak benar");
                }
    }
}
