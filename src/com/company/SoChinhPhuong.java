package com.company;

public class SoChinhPhuong {
    public static void main(String[] args) {
        int n = 143;
        if (check(n)) {
            System.out.println(n + " là số chính phương"); }
        else System.out.println(n + " không phải là số chính phương");
    }
    static boolean check(int n){
        boolean ketqua = false;
        if (Math.sqrt(n) - (int) Math.sqrt(n)==0) {ketqua = true;}
        return ketqua;
    }
}
