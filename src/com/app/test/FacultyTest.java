package com.app.test;

import com.app.inheritance.Faculty;
import com.app.inheritance.Person;

public class FacultyTest {
    public static void main(String[] args) {

        Person person = new Person("Neda", "Afshar");
        Faculty faculty = new Faculty("Ali", "Alavi", 5);

        System.out.println(person.getDetails());
        System.out.println(faculty.getDetails());

        Person p = new Faculty("John", "Smith", 6);
        System.out.println(p.getDetails());

    }
}
