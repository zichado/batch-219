package com.xsis.day1.quiz;
import java.util.Scanner;
public class logic1 {
    public static void main(String[] args) {
        int sudut1, sudut2, sudut3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input sudut 1 = ");
        sudut1 = scan.nextInt();
        System.out.println("Input sudut 2 = ");
        sudut2 = scan.nextInt();
        sudut3 = 180 - sudut1 - sudut2;
        System.out.println("Maka sudut 3 = "+sudut3);
        sudut3 = scan.nextInt();

    }
}
