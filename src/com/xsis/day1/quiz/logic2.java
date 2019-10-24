package com.xsis.day1.quiz;

import java.util.Scanner;

public class logic2 {
    public static void main(String[] args) {
        int nilai1, nilai2, nilai3, nilai4, rata;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan nilai 1= ");
        nilai1 = scan.nextInt();

        System.out.println("Masukan nilai 2= ");
        nilai2 = scan.nextInt();

        System.out.println("Masukan nilai 3= ");
        nilai3 = scan.nextInt();

        System.out.println("Masukan nilai 4= ");
        nilai4 = scan.nextInt();

        rata = (nilai1+nilai2+nilai3+nilai4)/4;
        System.out.println("nilai rat-rata" +rata);
    }
}
