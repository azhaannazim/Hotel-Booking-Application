package com.Hotel_Booking_App.Hotel_Booking_Application.service;

import com.Hotel_Booking_App.Hotel_Booking_Application.model.Role;
import com.Hotel_Booking_App.Hotel_Booking_Application.model.User;

import java.util.List;

public interface IRoleService {
    List<Role> getRoles();
    Role createRole(Role theRole);

    void deleteRole(Long id);
    Role findByName(String name);

    User removeUserFromRole(Long userId, Long roleId);
    User assignRoleToUser(Long userId, Long roleId);
    Role removeAllUsersFromRole(Long roleId);
}