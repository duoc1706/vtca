package com.company;

import java.util.Scanner;

public class Mark {
    private String Tenmon;
    private float DiemLT;//điểm lý thuyết
    float DiemTH;//điểm thực hành

    public String getTenmon() {
        return Tenmon;
    }

    public void setTenmon(String tenmon) {
        Tenmon = tenmon;
    }

    public float getDiemLT() {
        return DiemLT;
    }

    public void setDiemLT(float diemLT) {
        DiemLT = diemLT;
    }

    public float getDiemTH() {
        return DiemTH;
    }

    public void setDiemTH(float diemTH) {
        DiemTH = diemTH;
    }

    public float XuatMonHoc(float lythuyet, float thuchanh){
        return (lythuyet+thuchanh)/2;
    }
    public void NhapMonHoc(String mon, float lythuyet, float thuchanh){
        this.Tenmon=mon;
        this.DiemLT=lythuyet;
        this.DiemTH=thuchanh;
        System.out.println("Môn học: "+Tenmon);
        System.out.println("Điểm lý thuyết là: "+DiemLT);
        System.out.println("Điểm thực hành là: "+DiemTH);
        System.out.println("Điểm trung bình là: "+XuatMonHoc(DiemLT,DiemTH));
    }
}
