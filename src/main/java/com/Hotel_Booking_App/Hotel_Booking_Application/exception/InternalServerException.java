package com.Hotel_Booking_App.Hotel_Booking_Application.exception;

public class InternalServerException extends RuntimeException{
    public InternalServerException(String message) {
        super(message);
    }
}
