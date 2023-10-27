/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_4;

/**
 *
 * @author IT SUPPORTER
 */
public class Test {

    public static void main(String[] args) {
        BenhVien bv = new BenhVien("Bach Mai", "HN", "Nguyen Hung");
        BenhNhan bn = new BenhNhan("Hoang Van", 21, 'M', "Da Day", "Viem da day", bv);
        System.out.println(bn);
        bn.setTen("Vi Hoang Van");
        bn.setTuoi(21);
        bn.setGioiTinh('M');
        bn.setTienSu("Viem phoi");
        bn.setChanDoan("Ung thu phoi");
        bv.setTen("K");
        bn.setBenhVien(bv);
        System.out.println(bn);
        System.out.println("Ten benh nhan : "+bn.getTen());
        System.out.println("Tuoi benh nhan : "+bn.getTuoi());
        System.out.println("Gioi tinh  : "+bn.getGioiTinh());
        System.out.println("Benh tien su : "+bn.getTienSu());
        System.out.println("Chuan doan : "+bn.getChanDoan());
        System.out.println("Thong tin benh vien : "+bn.getBenhVien());
    }
}
