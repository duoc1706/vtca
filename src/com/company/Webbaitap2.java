package com.company;

import java.util.Scanner;

public class Webbaitap2 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập số tự nhiên n: "); int n = nhap.nextInt(); int tich = 0;
        for (int i=0; i < n+1; i++){
            tich = tich + i*i;
        }
        System.out.println("Tổng các bình phương S của "+n+" số là "+tich);
    }
}
