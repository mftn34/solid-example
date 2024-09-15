package com.mtfn.solid_example.singleResponsibility.best;

public class BookPrinter {
    // Print the book text to console
    public void printTextToConsole(Book book){
        System.out.println(book.getText());
    }
}