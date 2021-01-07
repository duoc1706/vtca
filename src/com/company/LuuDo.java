package com.company;

import java.util.Scanner;

public class LuuDo {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập a: "); float a = nhap.nextInt();
        System.out.print("Nhập b: "); float b = nhap.nextInt();
        if(b!=0){double c = a/b; System.out.println("Kết quả c là " + c);}
        else System.out.println("Lỗi chia cho 0");
    }}