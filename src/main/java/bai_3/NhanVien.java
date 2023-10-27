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
public class NhanVien {
    private String name;
    private DiaChi address;
    private String dob;
    private char gender;
    public NhanVien(){
        
    }
    public NhanVien(String name, DiaChi address, String dob, char gender){
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public DiaChi getAddress() {
        return address;
    }

    public void setAddress(DiaChi address) {
        this.address = address;
    }
    public String getDob(){
        return dob;
    }
    public void setDob(String dob){
        this.dob = dob;
    }
    public char getGender(){
        return gender;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    @Override
    public String toString(){
        return "Name : " +name+" Address : " +address+" DOB : "+dob+" Gender : "+gender;
    }
}

