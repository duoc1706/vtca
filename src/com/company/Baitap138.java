package com.company;

import java.util.Random;
import java.util.Scanner;

public class Baitap138 {
    public static void main(String[] args) {
        int a[] = new int[20];
        Scanner nhap = new Scanner(System.in);
        Random ngaunhien = new Random();
        int vitri = -1;
        System.out.print("[ ");
        for (int i = 0; i < 20; i++) {
            a[i] = ngaunhien.nextInt(1000);
            System.out.print(a[i] + " ");
        }
        System.out.print("]");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                vitri = i + 1;
                break;
            }
        }
        System.out.println();
        System.out.println(vitri);
    }
}
