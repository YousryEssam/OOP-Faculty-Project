/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculty;

/**
 *
 * @author Morcos Shehata
 */
public class Adminstrators extends Staff
{   
    private String Position;

    public Adminstrators() {
    }

    public Adminstrators(String Position, double salary, String department, int starting_year, String name, int age, String nationality, String gender, String address, String gov_id) {
        super(salary, department, starting_year, name, age, nationality, gender, address, gov_id);
        this.Position = Position;
    }
    

    

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    @Override
    public String toString() {
        return "Adminstrator{" + "name=" + name + ", age=" + age + ", nationality=" + nationality + ", address=" + address + ", gov_id=" + gov_id  +", gender=" + gender + "salary=" + salary + ", department=" + department + ", starting_year=" + starting_year +  "Position=" + Position + ", added succefully!"+'}';
    }
    
    
}
