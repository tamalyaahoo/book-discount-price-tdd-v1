package com.bnpp.kata.book.price.controller;

import com.bnpp.kata.book.price.model.BookPriceResponse;
import com.bnpp.kata.book.price.model.BookRequest;
import com.bnpp.kata.book.price.service.BookDiscountService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Book-Price", description = "API to calculate book basket price with discounts")
@RestController
@RequestMapping("/api/v1/book/price")
public class BookDiscountController {

    private final BookDiscountService bookDiscountService;

    public BookDiscountController(BookDiscountService bookDiscountService) {
        this.bookDiscountService = bookDiscountService;
    }

    @Operation(
            summary = "Calculate total price for a basket of books",
            description = "Takes a map of book titles to quantities and returns the total price with discounts applied"
    )
    @PostMapping("/calculate")
    public ResponseEntity<BookPriceResponse> calculatePrice(@RequestBody BookRequest request) {
        BookPriceResponse bookPriceResponse = bookDiscountService.calculatePrice(request.getBookList());
        return ResponseEntity.ok(bookPriceResponse);
    }
    }
