package com.company;

import java.util.Scanner;

public class Lab22b {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập 1 số lớn hơn 0: ");
        int n = nhap.nextInt();
        if (n <= 0) {
            System.out.println("Số không đúng điều kiện");
        } else {
            System.out.println("Đúng điều kiện");
        }
    }}