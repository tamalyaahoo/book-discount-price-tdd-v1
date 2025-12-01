package com.bnpp.kata.book.price.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class BookRequest {
    private List<Book> bookList;
}