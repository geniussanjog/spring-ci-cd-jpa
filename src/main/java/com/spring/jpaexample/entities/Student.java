package com.spring.jpaexample.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "student_data")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sid;
    private String name;
    private String city;

    public Student(int sid, String name, String city) {
        this.sid = sid;
        this.name = name;
        this.city = city;
    }

    public Student(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public Student() {
        super();
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
