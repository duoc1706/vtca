package com.company.Lab1;

import java.util.Scanner;

public class Timvitrisolonnhat {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int a[] = new int[]{11, 12, 15, 14, 13, 16, 18, 17};
        int max = a[0];
        int vitri = 0;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]){
                max=a[i];
                vitri = i;}
        }
        System.out.println("Vị trí max là " + vitri);
    }
}
