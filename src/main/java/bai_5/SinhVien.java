/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_5;

/**
 *
 * @author IT SUPPORTER
 */
public class SinhVien extends Nguoi{
    private String lop;
    private String nganh;
    private Truong truong;
    public SinhVien(){
        super();
    }

    public SinhVien(String ten, int tuoi, char gioiTinh,String lop, String nganh, Truong truong) {
        super(ten, tuoi, gioiTinh);
        this.lop = lop;
        this.nganh = nganh;
        this.truong = truong;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public Truong getTruong() {
        return truong;
    }

    public void setTruong(Truong truong) {
        this.truong = truong;
    }

    @Override
    public String toString() {
        return super.toString() + " Lop : " +lop+" Nganh "+nganh+" Truong "+truong;
    }
    
}
