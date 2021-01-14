package com.company;

import java.util.Scanner;

public class Lab3II7 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("%t%tMENU%t%t");
        System.out.println("=============================");
        String so1 = "1. CF";
        String so2 = "2. C";
        String so3 = "3. HDJ";
        String so4 = "4. DreamWeaver";
        String so5 = "5. RDBMS";
        String so6 = "6. Learn Java By Example";
        System.out.println(so1);
        System.out.println(so2);
        System.out.println(so3);
        System.out.println(so4);
        System.out.println(so5);
        System.out.println(so6);
        System.out.print("Chọn: "); int chon = nhap.nextInt();
        switch(chon){
            case 1:
                System.out.println("Bạn chọn "+so1); break;
            case 2:
                System.out.println("Bạn chọn "+so2); break;
            case 3:
                System.out.println("Bạn chọn "+so3); break;
            case 4:
                System.out.println("Bạn chọn "+so4); break;
            case 5:
                System.out.println("Bạn chọn "+so5); break;
            case 6:
                System.out.println("Bạn chọn "+so6); break;
            default:
                System.out.println("Không có trong danh sách");
        }
    }}
