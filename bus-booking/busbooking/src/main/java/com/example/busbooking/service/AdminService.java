package com.example.busbooking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.busbooking.entity.Booking;
import com.example.busbooking.entity.Bus;
import com.example.busbooking.repository.BookingRepository;
import com.example.busbooking.repository.BusRepository;

@Service
public class AdminService {

    private final BusRepository busRepository;
    private final BookingRepository bookingRepository;

    public AdminService(BusRepository busRepository, BookingRepository bookingRepository) {
        this.busRepository = busRepository;
        this.bookingRepository = bookingRepository;
    }

    // Add bus
    public Bus addBus(Bus bus) {
        return busRepository.save(bus);
    }

    // Delete bus
    public void deleteBus(Long busId) {
        busRepository.deleteById(busId);
    }

    // Get all bookings
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    // Get bookings of a user
    public List<Booking> getUserBookings(Long userId) {
        return bookingRepository.findByUserId(userId);
    }
}