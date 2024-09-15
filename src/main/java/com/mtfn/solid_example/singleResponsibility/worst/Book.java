package com.mtfn.solid_example.singleResponsibility.worst;

public class Book {

    private String name;
    private String author;
    private String text;

    public Book(String name, String author, String text) {
        this.name = name;
        this.author = author;
        this.text = text;
    }

    // Print text to console
    // wrong process
    public void printTextToConsole() {
        System.out.println(text);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
