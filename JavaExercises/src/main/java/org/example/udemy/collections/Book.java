package org.example.udemy.collections;

public class Book {
    private String title;
    private Double price;

    public Book(String tittle, Double price) {
        this.title = tittle;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "tittle='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
