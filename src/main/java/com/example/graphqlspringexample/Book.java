package com.example.graphqlspringexample;

import java.util.List;

public record Book(String id, String name, int pageCount, String author) {

    private static final List<Book> books = List.of(
            new Book("book-1", "Harry Potter", 223, "author-1"),
            new Book("book-2", "Moby Dick", 3130, "author-2"),
            new Book("book-3", "Interview with a Vampire", 225, "author-3"));

    public static Book getBookById(String id) {
        return books.stream().filter(book -> book.id.equals(id)).findFirst().orElse(null);
    }
}
