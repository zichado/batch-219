package com.xsis.day2.conditions;
// siswa umur > 20 dan (ipk >3.01 dan kurang dari 3.5
public class if02 {
    public static void main(String[] args) {
        int umur = 21;
        double ipk = 3.01;
        if (umur > 20 && ipk >= 3.01 && ipk < 3.5) {
            System.out.println("found");
        } else {
            System.out.println("false");
        }
    }
}
