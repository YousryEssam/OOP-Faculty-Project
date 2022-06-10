package com.mycompany.faculty;
public class Workers extends Staff
{

    public Workers()
    {
        department = "Worker";
    }

    public Workers(double salary, String department, int starting_year, String name, int age, String nationality, String gender, String address, String gov_id) {
        super(salary, department, starting_year, name, age, nationality, gender, address, gov_id);
    }


       @Override
    public String toString() {
        return "Worker{"+ "name=" + name + ", age=" + age + ", nationality=" + nationality + ", address=" + address + ", gov_id=" + gov_id  +", gender=" + gender + "salary=" + salary + ", department=" + department + ", starting_year=" + starting_year + ", added succefully!"+'}';
    }
}
