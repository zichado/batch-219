package com.xsis.day2.strings;

public class string06 {
    public static void main(String[] args) {
        String s,r;
        s = "Hello Java Programmer ";
        System.out.println(s);

        r = ""+s.substring(10,22) + s.substring(0,6) + s.substring(6,10);
        System.out.println(r);
    }
}
