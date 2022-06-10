
package com.mycompany.faculty;

import java.util.Objects;


public class Students extends Person 
{   
    private int study_level;
    private double GPA;
    private String department;
    private String Uni_id;

    public Students() {
    }

    public Students(int study_level, double GPA, String department, String Uni_id, String name, int age, String nationality, String gender, String address, String gov_id) {
        super(name, age, nationality, gender, address, gov_id);
        this.study_level = study_level;
        this.GPA = GPA;
        this.department = department;
        this.Uni_id = Uni_id;
    }


    

    public int getStudy_level() {
        return study_level;
    }

    public void setStudy_level(int study_level) {
        this.study_level = study_level;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getUni_id() {
        return Uni_id;
    }

    public void setUni_id(String Uni_id) {
        this.Uni_id = Uni_id;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", nationality=" + nationality + ", address=" + address + ", gov_id=" + gov_id +", gender=" + gender + "study_level=" + study_level + ", GPA=" + GPA + ", department=" + department + ", Uni_id=" + Uni_id + ", added succefully!"+'}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Students other = (Students) obj;
        if (this.study_level != other.study_level) {
            return false;
        }
        if (Double.doubleToLongBits(this.GPA) != Double.doubleToLongBits(other.GPA)) {
            return false;
        }
        if (!Objects.equals(this.department, other.department)) {
            return false;
        }
        if (!Objects.equals(this.Uni_id, other.Uni_id)) {
            return false;
        }
        return true;
    }
    
    


   
    
    
}
