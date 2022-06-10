package com.mycompany.faculty;
import java.util.Objects;
public abstract class Staff extends Person implements FCI
{   
    protected double salary;
    protected String department;
    protected int starting_year;
    public Staff() {
    }

    public Staff(String name, int age, String nationality, String gender, String address, String gov_id) {
        super(name, age, nationality, gender, address, gov_id);
    }



    public Staff(double salary, String department, int starting_year, String name, int age, String nationality, String gender, String address, String gov_id) {
        super(name, age, nationality, gender, address, gov_id);
        this.salary = salary;
        this.department = department;
        this.starting_year = starting_year;
    }
    public int getStarting_year() {
        return starting_year;
    }

    public void setStarting_year(int starting_year) {
        this.starting_year = starting_year;
    }

    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Staff{"+ "name=" + name + ", age=" + age + ", nationality=" + nationality + ", address=" + address + ", gov_id=" + gov_id  +", gender=" + gender + "salary=" + salary + ", department=" + department + ", starting_year=" + starting_year + ", added succefully!"+'}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Staff other = (Staff) obj;
        if (Double.doubleToLongBits(this.salary) != Double.doubleToLongBits(other.salary)) {
            return false;
        }
        if (this.starting_year != other.starting_year) {
            return false;
        }
        if (!Objects.equals(this.department, other.department)) {
            return false;
        }
        return true;
    }
   
    
    
}
