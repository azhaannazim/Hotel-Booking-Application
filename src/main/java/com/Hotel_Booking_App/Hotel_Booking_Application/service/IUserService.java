package com.Hotel_Booking_App.Hotel_Booking_Application.service;

import com.Hotel_Booking_App.Hotel_Booking_Application.model.User;

import java.util.List;

public interface IUserService {
    User registerUser(User user);
    List<User> getUsers();
    void deleteUser(String email);
    User getUser(String email);
}