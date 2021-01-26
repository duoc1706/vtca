package com.company.Lab1;

import java.util.Random;
import java.util.Scanner;

public class Bai132 {
    public static void main(String[] args) {
        int a[]=new int[10];
        Random ngaunhien = new Random();
        Scanner nhap = new Scanner(System.in);
        System.out.print("Số ngẫu nhiên được tạo: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = ngaunhien.nextInt(100);
            System.out.print(" "+a[i]);
        }
        System.out.println();
        System.out.print("Số chẵn: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==0) {
                System.out.print(a[i]+"  ");
            }
        }
    }
}
