package ru.spring.kolesnikov.models;

import jakarta.validation.constraints.NotEmpty;

public class Book {

    private int bookId;
    @NotEmpty(message = "Название не может быть пустым")
    private String title;
    private String author;
    private int year;

    public Book() {
    }

    public Book(int id, String title, String author, int year) {
        this.bookId = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
