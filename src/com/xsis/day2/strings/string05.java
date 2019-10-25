package com.xsis.day2.strings;

public class string05 {
    public static void main(String[] args) {
        String s = "Hello java programmer";
        System.out.println("Length = "+s.length());

        // search "java" indeks
        System.out.println("Indeks = "+s.indexOf("java"));

        //substr untuk get sebuah string dari index ke1 sampai dengan indeks ke n
        System.out.println("substr = "+s.substring(6,10));
    }
}
