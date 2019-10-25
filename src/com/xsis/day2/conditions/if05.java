package com.xsis.day2.conditions;

import java.util.Scanner;

public class if05 {
    public static void main(String[] args) {
        int score;
        char grade='0';
        Scanner scan= new Scanner(System.in);
        System.out.print("input score = ");
        score = scan.nextInt();
                if(score >=90){
                    grade='A' ;
                }else if(score < 90){
                grade='C';
        }
            System.out.println("grade ="+grade);

    }
}