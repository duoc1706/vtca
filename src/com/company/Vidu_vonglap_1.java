package com.company;

import java.util.Scanner;

public class Vidu_vonglap_1 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int tong = 0;
        System.out.print("Nhap N: ");
        int n = nhap.nextInt();
        for (int i = 1; i <= n; i++) {
            tong = tong + i;
        }
        System.out.println("Tổng từ 1 đến " + n + " là " + tong);
    }
}
