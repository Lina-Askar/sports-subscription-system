package com.mycompany.Project;

public class Person {

    private int ID;
    private String name;

    public Person() {
        
    }

    public Person(int ID, String name) {
        this.ID = ID;
        this.name = name;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("ID: %d\nName: %s\n", ID, name);
    }

}

