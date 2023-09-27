package com.example.graphqlspringexample;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BooksController {
    @QueryMapping
    public Book bookById(@Argument String id) {
        return Book.getBookById(id);
    }

    @SchemaMapping
    public Author author(Book book) {
        return Author.getById(book.author());
    }
}
