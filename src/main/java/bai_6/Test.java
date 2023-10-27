/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_6;

/**
 *
 * @author IT SUPPORTER
 */
public class Test {
    
    public static void main(String[] args) {
        PartTimeEmployee pte = new PartTimeEmployee("Hoang Van", 21, 'M', "vanvh2", "16/7/22", 15);
        System.out.println(pte);
        pte.setName("Vi Hoang Van");
        pte.setAge(21);
        pte.setGender('M');
        pte.setEmployerName("vanvh2");
        pte.setDateHired("16/8/22");
        System.out.println(pte);
        System.out.println("Name : "+pte.getName());
        System.out.println("Name : "+pte.getAge());
        System.out.println("Name : "+pte.getGender());
        System.out.println("Name : "+pte.getEmployerName());
        System.out.println("Name : "+pte.getDateHired());
        System.out.println("HoursPerWeek : "+pte.getHoursPerWeek());
    }
}
