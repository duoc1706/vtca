package com.company;

import java.util.Scanner;

public class LuuDoC {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap so a: "); int a = nhap.nextInt();
        System.out.print("Nhap so b: "); int b = nhap.nextInt();
        System.out.print("Nhap so c: "); int c = nhap.nextInt();
        System.out.println("Biểu thức là " + a + "*x^2+"+b+"*x+c = 0");
        int delta = b*b-4*a*c; System.out.println(delta);
        if(delta==0){
            double x1 = -b/2/a;
            System.out.println("Phương trình có nghiệm kép: "+x1);
        } else if (delta<0){System.out.println("Phương trình vô nghiệm");}
        else if (delta>0){double x1=(-b+Math.sqrt(delta))/(2*a);
            double x2 = (-b-Math.sqrt(delta))/(2*a);
            System.out.println();
            System.out.printf("Nghiệm thứ nhất là %.3f%n",x1);
            System.out.printf("Nghiệm thứ hai là %.3f%n",x2);
    }}
}
