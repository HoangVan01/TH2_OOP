/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_3;

import bai_2.DiaChi;

/**
 *
 * @author IT SUPPORTER
 */
public class Test {
    public static void main(String[] args) {

        DiaChi dc = new DiaChi("A", "B", "C", "D");
        NhanVien nv = new NhanVien("Hoang Van",dc,"25/07/02",'M');
        System.out.println(nv);
        nv.setName("Vi Hoang Van");
        nv.setDob("25/07/2002");
        nv.setGender('M');
        dc.setTinh("Phu Tho");
        nv.setAddress(dc);
        System.out.println(nv);  
        System.out.println("Name : "+nv.getName());
        System.out.println("Address : "+nv.getAddress());
        System.out.println("DOB : "+nv.getDob());
        System.out.println("Gender : "+nv.getGender());
    }
}
