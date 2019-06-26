package com.example.springboot.demo;

import javax.persistence.*;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "personId")
    private int personId;

    @Version
    private int version;

    private String title;
    private String firstName;
    private String lastName;

    public Person() {}

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public Person(int personId, String title, String firstName, String lastName) {
        this.setPersonId(personId);
        this.setTitle(title);
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

}
