package com.example.busbooking.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.busbooking.entity.Booking;
import com.example.busbooking.entity.Bus;
import com.example.busbooking.service.AdminService;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins = "http://localhost:5173") // Vite dev server
public class AdminController {

    private final AdminService service;

    public AdminController(AdminService service) {
        this.service = service;
    }

    // Add a bus
    @PostMapping("/add-bus")
    public Bus addBus(@RequestBody Bus bus) {
        return service.addBus(bus);
    }

    // Delete a bus
    @DeleteMapping("/delete-bus/{id}")
    public void deleteBus(@PathVariable Long id) {
        service.deleteBus(id);
    }

    // View all bookings
    @GetMapping("/bookings")
    public List<Booking> getAllBookings() {
        return service.getAllBookings();
    }

    // View bookings of a user
    @GetMapping("/my-bookings/{userId}")
    public List<Booking> getUserBookings(@PathVariable Long userId) {
        return service.getUserBookings(userId);
    }
}