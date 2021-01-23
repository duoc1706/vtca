package com.company;

import java.util.Scanner;

public class MainMark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số môn: ");
        int n = sc.nextInt();
        Mark diem[] = new Mark[n];
        String tenmon;
        float diemlt;
        float diemth;
        boolean cont = true;
        while (cont ==true){
        System.out.println("1. Nhập danh sách môn học\n2. Hiển thị danh sách\n" +
                "3. Điểm TB cao nhất\n4. Thoát");
        int nhanh = sc.nextInt();
        switch (nhanh) {
            case 1:
                for (int i = 0; i < n; i++) {
                    sc.nextLine();
                    System.out.print("Nhập tên môn, điểm lý thuyết, điểm thực hành"+(i+1)+": ");
                    tenmon = sc.nextLine();
                    diemlt = sc.nextFloat();
                    diemth = sc.nextFloat();
                    diem[i] = new Mark(tenmon, diemlt, diemth);
                }
                break;
            case 2:
                System.out.println("Danh sách môn học là: ");
                for (int i = 0; i < n; i++) {
                    System.out.println(diem[i].getTenmon());
                }
                break;
            case 3:
                System.out.print("Điểm trung bình cao nhất: ");
                float max=diem[0].getDiemTB();
                for (int i = 0; i < n; i++) {
                    if (diem[i].getDiemTB()>max){max=diem[i].getDiemTB();}
                }
                System.out.print(max);
                System.out.println(); break;
            case 4: cont=false; break;
        }}
    }
}
