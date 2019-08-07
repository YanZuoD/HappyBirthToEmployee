package com.zuoyanD.model;

public class Employee {
    private String lastName;
    private String firstName;
    private String dateOfBirth;
    private String email;

    public Employee(String lastName,
                    String firstName,
                    String dateOfBirth,
                    String email) {
        this.dateOfBirth = dateOfBirth;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Employee() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
}
