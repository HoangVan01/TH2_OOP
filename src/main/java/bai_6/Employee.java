/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_6;

/**
 *
 * @author IT SUPPORTER
 */
public class Employee extends Person {
    private String employerName;
    private String dateHired;
    public Employee(){
        super();
    }

    public Employee(String name, int age, char gender,String employerName, String dateHired) {
        super(name, age, gender);
        this.employerName = employerName;
        this.dateHired = dateHired;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }
    @Override
    public String toString(){
    return super.toString() + " Employer name : " +employerName+" Date Hired "+dateHired;
    }
}
