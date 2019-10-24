package com.xsis.day1;

import java.util.Scanner;

public class practice02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Firstname :");
        String firstName = scan.nextLine();
        System.out.println("LasatName:");
        String lastName = scan.nextLine();
        System.out.println("FullName :"+firstName +""+lastName);
    }
}
