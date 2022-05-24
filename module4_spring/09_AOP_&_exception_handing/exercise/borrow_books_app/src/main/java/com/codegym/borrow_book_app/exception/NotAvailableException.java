package com.codegym.borrow_book_app.exception;

public class NotAvailableException extends Exception{
    @Override
    public String getMessage(){
        return "Book is not available";
    }
}
