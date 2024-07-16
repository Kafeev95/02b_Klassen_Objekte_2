package com.cc.java;

public class Cat 
{
    // Eigenschaften / properties
    // Felder / fields / attributes

    // pass by reference
    public String name;
    public String furColor;
    // pass by value
    public int age;

    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

    // Rückgabetyp -- Cat
    public Cat getInstanceVariable(){
        return this;
    }

}
