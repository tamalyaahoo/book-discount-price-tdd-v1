package com.bnpp.kata.book.price.service;

import com.bnpp.kata.book.price.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BookDiscountService {

    private static final double BOOK_PRICE = 50.0;

    private static final Map<Integer, Double> DISCOUNTS = Map.of(
            1, 0.00,
            2, 0.05,
            3, 0.10,
            4, 0.20,
            5, 0.25
    );

    public double calculatePrice(List<Book> bookList) {
        int reqBookCount = bookList.size();
        double discount = DISCOUNTS.getOrDefault(reqBookCount, 0.0);
        double totalPrice;
        totalPrice = (BOOK_PRICE * reqBookCount) * (1 - discount);
        return totalPrice;
    }

}