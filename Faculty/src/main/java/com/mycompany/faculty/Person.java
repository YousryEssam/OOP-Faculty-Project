
package com.mycompany.faculty;

import java.util.Objects;

public abstract class Person implements FCI
{
    protected String name;
    protected int age;
    protected String nationality;
    protected String address;
    protected String gov_id;
    protected String gender;
    

    public Person() 
    {
    
    }

    public Person(String name, int age, String nationality, String gender, String address,String gov_id) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGov_id() {
        return gov_id;
    }

    public void setGov_id(String gov_id) {
        if (gov_id.length()==14) {
        this.gov_id = gov_id;}
        else {
        System.out.println("Wrong id, please try again");
        }
        
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

 
    


    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }




    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", nationality=" + nationality + ", address=" + address + ", gov_id=" + gov_id + ", gender=" + gender +", added succefully!"+ '}';
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
        final Person other = (Person) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.nationality, other.nationality)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.gov_id, other.gov_id)) {
            return false;
        }
        if (!Objects.equals(this.gender, other.gender)) {
            return false;
        }
        return true;
    }
    
    
    
    
}

