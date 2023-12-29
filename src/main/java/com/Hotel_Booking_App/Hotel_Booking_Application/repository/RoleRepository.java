package com.Hotel_Booking_App.Hotel_Booking_Application.repository;

import com.Hotel_Booking_App.Hotel_Booking_Application.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Simpson Alfred
 */

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(String role);
    boolean existsByName(String role);
}