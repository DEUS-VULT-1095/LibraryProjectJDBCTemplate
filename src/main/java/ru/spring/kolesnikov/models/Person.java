package ru.spring.kolesnikov.models;

import jakarta.validation.constraints.*;

public class Person {

    private int personId;
    @Pattern(regexp = "[A-ZА-Я][a-zа-я]* [A-ZА-Я][a-zа-я]* [A-ZА-Я][a-zа-я]*",
        message = "ФИО должно соответствовать формату: Фамилия Имя Отчество")
    private String fullName;
    @Min(value = 1900, message = "Дата рождения должна быть не менее 1900 года")
    private int yearOfBirth;

    public Person() {
    }

    public Person(int id, String name, int year) {
        this.personId = id;
        this.fullName = name;
        this.yearOfBirth = year;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
