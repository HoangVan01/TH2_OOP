/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_5;

/**
 *
 * @author IT SUPPORTER
 */
public class Test {
    public static void main(String[] args) {
        Truong truong = new Truong("DHCN","HaNoi","Tran A");
        SinhVien sv = new SinhVien("Hoang Van", 21, 'M', "DHCNTTLT", "CNTT", truong);
        System.out.println(sv);
        sv.setTen("Vi Hoang Van");
        sv.setTuoi(22);
        sv.setGioiTinh('M');
        sv.setLop("DHLT");
        sv.setNganh("CNTTLT");
        truong.setTen("FPT Poly");
        sv.setTruong(truong);
        System.out.println(sv);
        System.out.println("Ten sinh vien : "+sv.getTen());
        System.out.println("Tuoi sinh vien : "+sv.getTuoi());
        System.out.println("Truong sinh vien : "+sv.getTruong());
        System.out.println("Gioi tinh sinh vien : "+sv.getGioiTinh());
        System.out.println("Lop sinh vien : "+sv.getLop());
        System.out.println("Nganh sinh vien : "+sv.getNganh());
    }
}
