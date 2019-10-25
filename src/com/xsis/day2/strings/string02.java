package com.xsis.day2.strings;

import java.util.Scanner;

public class string02 {
    public static void main(String[] args) {
        String s, reverse;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input = ");
        s = scan.next();
        reverse = ""+ s.charAt(3)+s.charAt(2)+s.charAt(1)+s.charAt(0);
        System.out.println("reverse ="+ reverse);
    }
}
