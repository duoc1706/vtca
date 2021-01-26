package com.company.Lab1;

import java.util.Scanner;

public class Webbaitap3 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập số tự nhiên n: "); int n = nhap.nextInt(); double tong = 0;
        for (int i=1; i < n+1; i++){
            tong = tong + 1/i;
        }
        System.out.println("Tổng các bình phương S của "+n+" số là "+tong);
    }
}
