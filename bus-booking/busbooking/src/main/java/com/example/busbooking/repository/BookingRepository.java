package com.example.busbooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.busbooking.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByUserId(Long userId);
}