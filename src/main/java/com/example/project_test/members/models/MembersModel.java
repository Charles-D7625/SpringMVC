package com.example.project_test.members.models;


public class MembersModel {

    private String firstName;
    private String lastName;

    public MembersModel() {

    }

    public MembersModel(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "firstName = '" + firstName + '\'' + ", lastName = '" + lastName;
    }

}
