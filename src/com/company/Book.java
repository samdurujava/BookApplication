package com.company;

public class Book {
    public String author;
    public String title;
    public double price;
    public String description;
    public String isbn;

    public String summary() {
        return author + " wrote a book about " + description;
    }

    public double pricePlusShipping() {
        double result = price + 5.00;
        return result;
    }

    public String priceSummary() {
        return "The book costs " + pricePlusShipping();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String fixISBN(String s) {

    }
}
