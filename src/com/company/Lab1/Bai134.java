package com.company.Lab1;

import java.util.Random;
import java.util.Scanner;

public class Bai134 {
    public static void main(String[] args) {
        double a[]= new double[10];
        Scanner nhap = new Scanner(System.in);
        Random ngaunhien = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i]=ngaunhien.nextDouble();
            System.out.printf("%f  ",a[i]);
        }
        double max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max<a[i]) { max= a[i];}
        }
        System.out.println();System.out.println();
        System.out.println("Giá trị lớn nhất là "+max);
    }
}
