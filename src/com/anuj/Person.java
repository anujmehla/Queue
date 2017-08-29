package com.anuj;

public class Person
{
//    we are going to create a new class Person because in real world we are not gonna use primitive types
//    so become familiar with real world we are using person class
    private String name;
    private String rollno;
    public Person(String name, String rollno)
    {
        this.name=name;
        this.rollno=rollno;
    }

    @Override
    public String toString() {
        return "name "+this.name+" rollno "+this.rollno;
    }
}
