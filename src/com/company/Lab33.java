package com.company;

import java.util.Scanner;

public class Lab33 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập 4 số thực: ");
        double a1 = nhap.nextFloat();
        double a2 = nhap.nextFloat();
        double a3 = nhap.nextFloat();
        double a4 = nhap.nextFloat(); double max = a1;
        if (a1>max) {
            max = a1;
        } if (a2 > max) {
            max = a2;
        } if (a3 > max) {
            max = a3;
        } if (a4 > max) {
            max = a4;
        }
        double min = a1;
        if (a1 < min) {
            min = a1;
        } if (a2 < min) {
            min = a2;
        } if (a3 < min) {
            min = a3;
        } if (a4 < min) {
            min = a4;
        } System.out.println("Số lớn nhất là " + max + ". Số nhỏ nhất là "+min);
    }
}
