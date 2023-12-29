package com.Hotel_Booking_App.Hotel_Booking_Application.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
