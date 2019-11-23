package com.example.databindingone;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    boolean isAdult = false;

    public boolean isAdult() {
        return isAdult;
    }

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        if(age > 16)
            isAdult = true;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

}
