package com.company;

import java.util.Scanner;

public class Webbaitap12 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập số tự nhiên n: "); int n = nhap.nextInt();
        System.out.print("Nhập số tự nhiên x: "); int x = nhap.nextInt();
        double tong = 0;
        for (int i=1; i < n+1; i++){
            tong = tong + Math.pow(x,i);
        }
        System.out.printf("Tổng S là %.0f",tong);
    }
}
