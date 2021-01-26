package com.company.Lab1;

import java.util.Scanner;

public class Webbaitap15 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập số tự nhiên n: "); int n = nhap.nextInt();
        double tong = 0; double mauso = 0;
        for (int i=1; i <=n; i++){
            mauso += i;
            tong = tong + 1/mauso;
        }
        System.out.printf("Tổng S là %.3f",tong);
    }
}
