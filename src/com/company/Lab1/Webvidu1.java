package com.company.Lab1;

import java.util.Scanner;

public class Webvidu1 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập số tự nhiên n: "); int n = nhap.nextInt(); int tong = 0;
        for (int i=0; i < n+1; i++){
            tong = tong + i;
        }
        System.out.println("Tổng S của "+n+" số là "+tong);
    }
}
