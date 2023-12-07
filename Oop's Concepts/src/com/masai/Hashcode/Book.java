package com.masai.Hashcode;

import java.util.Objects;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    // Other methods, getters, setters...

    public static void main(String[] args) {
        // Create two books with the same title and author
        Book book1 = new Book("Java Programming", "John Doe");
        Book book2 = new Book("Java Programming", "John Doe");

        // Check equality
        System.out.println("Are the books equal? " + book1.equals(book2));

        // Check hash codes
        System.out.println("Hash code for book1: " + book1.hashCode());
        System.out.println("Hash code for book2: " + book2.hashCode());

        // Create a HashSet to test hash-based collections
        // Since we override hashCode and equals, the HashSet will correctly identify duplicate books
        java.util.HashSet<Book> bookSet = new java.util.HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);

        System.out.println("Number of unique books in the set: " + bookSet.size());
    }
}