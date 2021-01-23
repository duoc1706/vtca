package com.company;

public class Mark {
    private String Tenmon;
    private float DiemLT;//điểm lý thuyết
    private float DiemTH;//điểm thực hành
    private float DiemTB;

    public float getDiemTB() {
        return DiemTB;
    }

    public void setDiemTB() {
        DiemTB = (DiemLT + DiemTH) / 2;
    }

    public Mark(String tenmon, float diemLT, float diemTH) {
        this.Tenmon = tenmon;
        this.DiemLT = diemLT;
        this.DiemTH = diemTH;
    }

    public Mark() {
    }

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

    public void XuatMonHoc() {
        System.out.println("Tên môn học: " + Tenmon);
        System.out.println("Điểm lý thuyết: " + DiemLT);
        System.out.println("Điểm thực hành: " + DiemTH);
        System.out.println("Điểm trung bình: " + DiemTB);
    }
}
