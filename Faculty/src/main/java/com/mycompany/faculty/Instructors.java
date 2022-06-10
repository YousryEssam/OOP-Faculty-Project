/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculty;

import java.util.Objects;

/**
 *
 * @author Morcos Shehata
 */
public class Instructors extends Staff
{
    private String Degree;

    public Instructors() {
    }

    

    public Instructors(String Degree, double salary, String department, int starting_year, String name, int age, String nationality, String gender, String address, String gov_id) {
        super(salary, department, starting_year, name, age, nationality, gender, address, gov_id);
        this.Degree = Degree;
    }


    public String getDegree() {
        return Degree;
    }

    public void setDegree(String Degree) {
        this.Degree = Degree;
    }

    @Override
    public String toString() {
        return "Instructor{" + "name=" + name + ", age=" + age + ", nationality=" + nationality + ", address=" + address + ", gov_id=" + gov_id + ", gender=" + gender  + "Degree=" + Degree + "salary=" + salary + ", department=" + department + ", starting_year=" + starting_year + ", added Succefully!";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Instructors other = (Instructors) obj;
        if (!Objects.equals(this.Degree, other.Degree)) {
            return false;
        }
        return true;
    }


    
    
    
    
}
