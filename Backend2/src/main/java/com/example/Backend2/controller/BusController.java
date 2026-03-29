package com.example.Backend2.controller;
import com.example.Backend2.model.Bus;
import com.example.Backend2.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/buses")
@CrossOrigin(origins = "*")
public class BusController {

    @Autowired
    private BusService busService;

    @GetMapping("/search")
    public List<Bus> searchBuses(
            @RequestParam String source,
            @RequestParam String destination,
            @RequestParam String date) {

        return busService.searchBuses(source, destination, date);
    }

    @PostMapping("/add")
    public Bus addBus(@RequestBody Bus bus) {
        return busService.addBus(bus);
    }
}

