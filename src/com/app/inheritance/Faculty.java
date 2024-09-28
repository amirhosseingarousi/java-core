package com.app.inheritance;

public class Faculty extends Person{
    private int yearsOfExperience;

    public Faculty(String firstName, String lastName, int yearsOfExperience) {
        super(firstName, lastName);
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String getDetails() {
        return "[ first name: " + super.getFirstName() + ", last name: " + super.getLastName()
                + ", experiences: " + yearsOfExperience + " years ]";
    }
}
