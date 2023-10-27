/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_2;

/**
 *
 * @author IT SUPPORTER
 */
public class Test {
    public static void main(String[] args) {
        DiaChi dc = new DiaChi("A", "B", "C", "D");
        System.out.println(dc);
        dc.setThon("E");
        dc.setXa("F");
        dc.setHuyen("G");
        dc.setTinh("H");
        System.out.println(dc);
        System.out.println("Thon la : " +dc.getThon());
        System.out.println("Xa la : " +dc.getXa());
        System.out.println("Huyen la : " +dc.getHuyen());
        System.out.println("Tinh la : " +dc.getTinh());
    }
}
