package com.bnpp.kata.book.price.service;

import com.bnpp.kata.book.price.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookDiscountService {

   public double calculatePrice(List<Book> bookList) {
        return 50.0;
    }

}