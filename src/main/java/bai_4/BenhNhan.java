/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_4;

/**
 *
 * @author IT SUPPORTER
 */
public class BenhNhan extends Nguoi {
    private String tienSu;
    private String chanDoan;
    private BenhVien benhVien;
    
    public BenhNhan(){
        super();
    }

    public BenhNhan( String ten, int tuoi, char gioiTinh,String tienSu, String chanDoan, BenhVien benhVien) {
        super(ten, tuoi, gioiTinh);
        this.tienSu = tienSu;
        this.chanDoan = chanDoan;
        this.benhVien = benhVien;
    }

    public String getTienSu() {
        return tienSu;
    }

    public void setTienSu(String tienSu) {
        this.tienSu = tienSu;
    }

    public String getChanDoan() {
        return chanDoan;
    }

    public void setChanDoan(String chanDoan) {
        this.chanDoan = chanDoan;
    }

    public BenhVien getBenhVien() {
        return benhVien;
    }

    public void setBenhVien(BenhVien benhVien) {
        this.benhVien = benhVien;
    }
    @Override
    public String toString(){
        return super.toString() + " Tien su : " +tienSu+" Chan doan "+chanDoan+" Benh Vien "+benhVien;
    }
}
