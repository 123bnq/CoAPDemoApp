package com.client;

public class Book {
    private String Title;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getPages() {
        return Pages;
    }

    public void setPages(int pages) {
        Pages = pages;
    }

    private int Pages;

    public Book(String title, int pages) {
        Title = title;
        Pages = pages;
    }

    public Book(Book book) {
        Title = book.getTitle();
        Pages = book.getPages();
    }

}
