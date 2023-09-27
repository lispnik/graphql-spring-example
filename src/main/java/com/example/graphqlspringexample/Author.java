package com.example.graphqlspringexample;

import java.util.List;

public record Author(String id, String firstName, String lastName) {
    private static final List<Author> authors = List.of(
            new Author("author-1", "Foo", "Bar"),
            new Author("author-2", "Name1", "Name2"),
            new Author("author-3", "Name3", "Name4")
    );

    public static Author getById(String id) {
        return authors.stream().filter(author -> author.id.equals(id)).findFirst().orElse(null);
    }
}
