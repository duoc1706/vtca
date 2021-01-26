package com.company.Lab1;

import java.util.Random;
import java.util.Scanner;

public class Bai140 {
    public static void main(String[] args) {
        double a[] = new double[15];
        Scanner nhap = new Scanner(System.in);
        Random ngaunhien = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i]= ngaunhien.nextDouble()*(1000-(-1000))-1000;
            System.out.printf("%.2f  ",a[i]);
        }
        double min = 1000; boolean thaydoi=false;
        for (int i = 0; i < a.length; i++) {
            if ((min>a[i]) && (a[i]>0)){min = a[i]; thaydoi=true;}
        } if (thaydoi=false) {min=-1;}
        System.out.println(); System.out.printf("Min dương là: %.3f",min);
}}
