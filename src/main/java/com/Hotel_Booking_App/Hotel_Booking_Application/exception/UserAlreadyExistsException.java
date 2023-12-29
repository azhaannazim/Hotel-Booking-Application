package com.Hotel_Booking_App.Hotel_Booking_Application.exception;

public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(String s) {
        super(s);
    }
}
