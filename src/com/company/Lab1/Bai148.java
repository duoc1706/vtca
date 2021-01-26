package com.company.Lab1;

import java.util.Random;
import java.util.Scanner;

public class Bai148 {
    public static void main(String[] args) {
        int a[] = new int[10];
        Scanner nhap = new Scanner(System.in);
        Random ngaunhien = new Random();
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = ngaunhien.nextInt();
            System.out.print(a[i] + " ");
        }
        System.out.println(); a[a.length]=nhap.nextInt();
        int num = a[0];
        for (int i = a.length; i >= 0; i--) {
            boolean nguyento = true;
            for (int j = 2; j < a[i]; j++) {
                if (a[i] % j == 0) {
                    nguyento = false;
                    num = a[i];
                }
            }
            if (nguyento = true) {
                System.out.println("Nguyên tố: " + num);
            }
        }
    }

}