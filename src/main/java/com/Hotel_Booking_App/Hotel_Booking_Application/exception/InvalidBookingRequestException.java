package com.Hotel_Booking_App.Hotel_Booking_Application.exception;

public class InvalidBookingRequestException extends RuntimeException{
    public InvalidBookingRequestException(String message) {
        super(message);
    }
}
