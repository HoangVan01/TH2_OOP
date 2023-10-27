/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_1;

/**
 *
 * @author IT SUPPORTER
 */
public class Test {

    public static void main(String[] args) {
        Person per = new Person("Hoang Van", "25/07/02", "Ha Noi", 'M', "van956335@gmail.com", "0966740702");
        System.out.println(per);
        per.setEmail("hoangvan250702@gmail.com");
        per.setPob("Phu Tho");
        System.out.println(per);
        System.out.println("Name :" + per.getName());
        System.out.println("DOB : " + per.getDob());
        System.out.println("POB : " + per.getPob());
        System.out.println("Gender : " + per.getGender());
        System.out.println("Email : " + per.getEmail());
        System.out.println("Phone : " + per.getPhone());
    }
}
