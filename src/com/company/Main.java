package com.company;

public class Main {

    public static void main(String[] args) {

        Book b = new Book();
        b.author = "Sam Duru";
        b.price = 29.00;
        b.description = "How to sleep in class";

        String message = b.summary();
        System.out.println(message);

        //System.out.println(b.pricePlusShipping());
        System.out.println(b.priceSummary());
    }
}
