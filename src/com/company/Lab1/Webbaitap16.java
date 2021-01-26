package com.company.Lab1;

import java.util.Scanner;

public class Webbaitap16 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập số tự nhiên n: "); int n = nhap.nextInt();
        System.out.print("Nhập số tự nhiên x: "); int x = nhap.nextInt();
        double tong = 0; double mauso = 0; int mu = 0;
        for (int i=1; i<=n; i++){
            mu += i;
            tong += Math.pow(x,mu)/mu;
        }
        System.out.printf("Tổng S là %.3f",tong);
}}
