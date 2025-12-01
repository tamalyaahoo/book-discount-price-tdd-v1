package com.bnpp.kata.book.price.service;

import com.bnpp.kata.book.price.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookDiscountService {

    private static final double BOOK_PRICE = 50.0;



    public double calculatePrice(List<Book> bookList) {
        int reqBookCount = bookList.size();
        double totalPrice = 0.0;
        if(reqBookCount == 1) {
            totalPrice = BOOK_PRICE * reqBookCount;
        }else if(reqBookCount == 2){
            totalPrice = (BOOK_PRICE * reqBookCount) * (1 - 0.05);
        }else if(reqBookCount == 3){
            totalPrice = (BOOK_PRICE * reqBookCount) * (1 - 0.10);
        }else if(reqBookCount == 4){
            totalPrice = (BOOK_PRICE * reqBookCount) * (1 - 0.20);
        }
        return totalPrice;
    }

}